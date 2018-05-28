package com.fly.caipiao.comment.configuration.datasource;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(-1)
@Component
public class DataSourceAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("@annotation(ds)")
    public void storeDataSource(JoinPoint point, DataSource ds) throws Throwable {
        logger.debug("store DataSource : {} > {}", ds.value(), point.getSignature());
        DataSourceContextHolder.set(ds.value());
    }

    @After("@annotation(ds)")
    public void restoreDataSource(JoinPoint point, DataSource ds) {
        logger.debug("Revert DataSource : {} > {}", ds.value(), point.getSignature());
        DataSourceContextHolder.clear();
    }
}
