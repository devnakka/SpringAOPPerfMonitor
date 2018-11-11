package com.devnakka.spring.aop.springaop.springaop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */
public class CommonJoinPointConfig {

    @Pointcut("execution(* com.devnakka.spring.aop.springaop.springaop.dao.*.*(..))")
    public void dataLayerPointCut(){}

    @Pointcut("execution(* com.devnakka.spring.aop.springaop.springaop.business.*.*(..))")
    public void businessLayerPointCut(){}

    @Pointcut("@annotation(com.devnakka.spring.aop.springaop.springaop.TimeTaken)")
    public void timeTakenPointCut(){}
}
