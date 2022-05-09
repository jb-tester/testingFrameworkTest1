package com.mytests.spring43.testingFramework.test1;

import com.mytests.spring43.testingFramework.test1.beans.Bean1;
import com.mytests.spring43.testingFramework.test1.components.Comp1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/15/2016.
 * Project: testingFrameworkTest1
 * *******************************
 */
@RunWith(SpringRunner.class)
@ContextConfiguration
@ActiveProfiles(profiles = "prof1")
@TestPropertySource(locations = {"classpath:myProps.properties"}, properties = {"prop1 = val11","prop2 = val22"})
public class Comp1Test{


    @Autowired
    private Comp1 comp1;
    @Autowired
    private Bean1 bean1;

    @Value("#{'${prop1}'}")  // remove '' to check the property resolving in spel, like "#{${prop1}}
    String foo;
    @Value("${prop2}")
    String bar;

    @Value("${prop3}")
    String buzz;

    @Test
    public void testComp1() throws Exception {
        Assert.assertEquals(comp1.getBean1(),bean1);

    }

    @Test
    public void testFoo() throws Exception {
        Assert.assertEquals(foo,"val11");

    }

    @Test
    public void testBar() throws Exception {
        Assert.assertEquals(bar,"val22");

    }

    @Test
    public void testBuzz() throws Exception {
        Assert.assertEquals(buzz,"val33");

    }
}