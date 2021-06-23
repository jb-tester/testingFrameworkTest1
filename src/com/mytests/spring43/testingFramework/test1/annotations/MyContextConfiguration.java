package com.mytests.spring43.testingFramework.test1.annotations;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.GenericXmlContextLoader;

import java.lang.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/12/2017.
 * Project: testingFrameworkTest1
 * *******************************
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ContextConfiguration(loader = GenericXmlContextLoader.class)
public @interface MyContextConfiguration {
    @AliasFor(annotation = ContextConfiguration.class, attribute = "locations")
    String[] xmlFiles() default {};
}
