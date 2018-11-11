package com.devnakka.spring.aop.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */
@Aspect
@Configuration
public class AroundAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.devnakka.spring.aop.springaop.springaop.CommonJoinPointConfig.timeTakenPointCut()")
    public void aroundAspect(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        pjp.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info(" {} time taken {} ", pjp, timeTaken);
    }
}
