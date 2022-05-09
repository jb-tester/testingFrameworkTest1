package com.mytests.spring43.testingFramework.test1;

import com.mytests.spring43.testingFramework.test1.annotations.MyContextConfiguration;
import com.mytests.spring43.testingFramework.test1.annotations.MyTestProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/26/2016.
 * Project: testingFrameworkTest1
 * *******************************
 */
@RunWith(SpringRunner.class)
@MyContextConfiguration(xmlFiles = "classpath:propertiesSourceTestConfig2.xml")
@MyTestProperties(propertyFiles = {"mess1.properties","classpath:/mess2.properties"})
public class PropertiesSourceTest2 {

    @Value("${message1}")
    String mess1;
    @Value("${message2}")
    String mess2;

    @Test
    public void testMess1(){
        Assert.assertEquals(mess1,"hello");
    }
    @Test
    public void testMess2(){
        Assert.assertEquals(mess2,"bye");
    }
}
