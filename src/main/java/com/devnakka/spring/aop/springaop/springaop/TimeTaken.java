package com.devnakka.spring.aop.springaop.springaop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeTaken {
}
