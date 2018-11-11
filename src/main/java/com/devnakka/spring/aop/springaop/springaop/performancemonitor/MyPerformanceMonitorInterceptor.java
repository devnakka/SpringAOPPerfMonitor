package com.devnakka.spring.aop.springaop.springaop.performancemonitor;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AbstractMonitoringInterceptor;

import java.util.Date;

public class MyPerformanceMonitorInterceptor extends AbstractMonitoringInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public MyPerformanceMonitorInterceptor() {
    }

    public MyPerformanceMonitorInterceptor(boolean useDynamicLogger) {
            setUseDynamicLogger(useDynamicLogger);
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        String name = createInvocationTraceName(invocation);
        long start = System.currentTimeMillis();
        logger.info("Method "+name+" execution started at:"+new Date());
        try {
            return invocation.proceed();
        }
        finally {
            long end = System.currentTimeMillis();
            long time = end - start;
            logger.info("Method "+name+" execution lasted:"+time+" ms");
            logger.info("Method "+name+" execution ended at:"+new Date());

            if (time > 10){
                logger.warn("Method execution longer than 10 ms!");
            }

        }
    }

    @Override
    protected Object invokeUnderTrace(MethodInvocation methodInvocation, Log log) throws Throwable {
        return null;
    }


}
