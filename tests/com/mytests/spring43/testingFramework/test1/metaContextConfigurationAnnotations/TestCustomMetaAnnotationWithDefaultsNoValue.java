package com.mytests.spring43.testingFramework.test1.metaContextConfigurationAnnotations;

import com.mytests.spring43.testingFramework.test1.annotations.CustomContextConfigurationWithDefaults;
import com.mytests.spring43.testingFramework.test1.annotations.DefaultContextConfiguration;
import com.mytests.spring43.testingFramework.test1.beans.Bean2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@CustomContextConfigurationWithDefaults
public class TestCustomMetaAnnotationWithDefaultsNoValue {

    @Autowired
    private Bean2 b2;

    @Test
    public void testB2() throws Exception {
        Assert.assertEquals(b2.getId(),"b2_from_beans");

    }
}
