package com.mytests.spring43.testingFramework.test1.configs;

import com.mytests.spring43.testingFramework.test1.beans.Bean1;
import org.springframework.context.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/13/2016.
 * Project: coreFeaturesTest1
 * *******************************
 */
@Configuration
@ComponentScan(basePackages = "com.mytests.spring43.testingFramework.test1.components")
@Description("main configuration class")
public class MyConfig1 {

    @Bean @Profile("prof1")
    public Bean1 b11() {
        return new Bean1("prof1_b1");
    }
    @Bean @Profile("prof2")
    public Bean1 b12() {
        return new Bean1("prof2_b1");
    }
}
