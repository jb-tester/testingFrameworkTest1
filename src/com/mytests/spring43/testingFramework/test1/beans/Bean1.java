package com.mytests.spring43.testingFramework.test1.beans;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/13/2016.
 * Project: coreFeaturesTest1
 * *******************************
 */
public class Bean1 {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bean1{");
        sb.append("id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getId() {
        return id;
    }

    private final String id;

    public Bean1(String s) {
        this.id = s;
    }
}
