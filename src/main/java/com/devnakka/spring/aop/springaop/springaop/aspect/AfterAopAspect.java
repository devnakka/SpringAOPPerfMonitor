package com.devnakka.spring.aop.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */
@Aspect
@Configuration
public class AfterAopAspect {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "com.devnakka.spring.aop.springaop.springaop.CommonJoinPointConfig.businessLayerPointCut()",
            returning = "result")
    public void afterReturning(JoinPoint jp, Object result){
        logger.info("{} returned {}", jp, result);
    }

    @AfterThrowing(
            value = "com.devnakka.spring.aop.springaop.springaop.CommonJoinPointConfig.businessLayerPointCut()",
            throwing = "exception")
    public void afterThrowing(JoinPoint jp, Exception exception){
        logger.info("{} has exception {}", jp, exception.getMessage());
    }

    @After(
            value = "com.devnakka.spring.aop.springaop.springaop.CommonJoinPointConfig.businessLayerPointCut()")
    public void after(JoinPoint jp){
        logger.info("has completed execution of {}", jp);
    }
}
