package com.mytests.spring43.testingFramework.test1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.AfterTransaction;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

import static org.junit.Assert.assertEquals;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/18/2016.
 * Project: testingFrameworkTest1
 * *******************************
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:com/mytests/spring43/testingFramework/test1/transactional.xml"})
@Transactional(transactionManager = "ptm1")
@SqlConfig(transactionManager = "ptm1", dataSource = "ds")
public class TransactionalTest1 {



    protected JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Test
    @SqlGroup(
            {@Sql(value = "classpath:mysql.sql",
                  config = @SqlConfig(transactionManager = "ptm1", dataSource = "ds"))
            })
    public void footabTest1() {

        assertNumRows(4);
    }

    @Test
    @Sql(scripts = "classpath:mysql.sql",statements = "insert into footab values('kot',1,false);")
    public void footabTest2() {

        assertNumRows(5);
    }

    protected int countRowsInTable(String tableName) {
        return JdbcTestUtils.countRowsInTable(this.jdbcTemplate, tableName);
    }

    protected void assertNumRows(int expected) {
        assertEquals("Number of rows in the table.", expected, countRowsInTable("footab"));
    }

    @BeforeTransaction
    void beforeTransaction() {
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++Before+++++++++");
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }

}
