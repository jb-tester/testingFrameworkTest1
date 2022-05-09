package com.mytests.spring43.testingFramework.test1;

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
@ContextConfiguration(locations = "propertiesSourceTestConfig.xml")
@TestPropertySource
public class PropertiesSourceTest3 {

    @Value("${default1}") // remove '' to check the property resolving in spel, like "#{${message1}}
    String mess1;
    @Value("#{'${default2}'}") // remove '' to check the property resolving in spel, like "#{${message2}}
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
