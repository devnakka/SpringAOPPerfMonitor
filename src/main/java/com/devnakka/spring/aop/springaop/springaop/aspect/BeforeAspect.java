package com.devnakka.spring.aop.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author Srikanth Nakka on 11/8/2018
 * @project spring-aop
 */
//AOP
//Configuration
//Combination of pointcut and Advice is an Aspect
@Aspect
@Configuration
public class BeforeAspect {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //pointcut - expression
    @Before("com.devnakka.spring.aop.springaop.springaop.CommonJoinPointConfig.dataLayerPointCut()")
    // joinpoint has specific pointcut details
    public void beforeAspect(JoinPoint jp){

        //Advice
        logger.info(" Call Intercepted. {} ", jp);
    }
}
