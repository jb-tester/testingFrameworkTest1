package com.mytests.spring43.testingFramework.test1.components;

import com.mytests.spring43.testingFramework.test1.beans.Bean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/13/2016.
 * Project: coreFeaturesTest1
 * *******************************
 */
@Component
public class Comp1 {


    @Autowired
    private Bean1 bean1;

    public Bean1 getBean1() {
        return bean1;
    }
}
