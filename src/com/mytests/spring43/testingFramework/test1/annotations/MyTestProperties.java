package com.mytests.spring43.testingFramework.test1.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.TestPropertySource;

import java.lang.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/15/2016.
 * Project: testingFrameworkTest1
 * *******************************
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@TestPropertySource
public @interface MyTestProperties {

    @AliasFor(attribute = "locations", annotation = TestPropertySource.class)
    String[] propertyFiles() default {};
}
