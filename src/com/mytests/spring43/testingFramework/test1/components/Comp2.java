package com.mytests.spring43.testingFramework.test1.components;

import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/13/2016.
 * Project: coreFeaturesTest1
 * *******************************
 */
@Component
public class Comp2 {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Comp2{");
        sb.append('}');
        return sb.toString();
    }
}
