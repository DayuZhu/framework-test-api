package com.framework.api.commons.web.config;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 功能描述: com.framework.api.uri.saas
 *
 * @className:WeekendSimpleCacheAspect
 * @projectName:20190418-weekend-product-api
 * @author:Dayu
 * @date: 2019/4/22 17:02
 */
@Aspect
@Component
public class UriSaasAspect {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * com.framework.api.uri.saas.*.*..UriSaasShell.*..*(..)) " +
            "&& @annotation(com.framework.api.commons.web.config.UriSaas)")
    public void executeService() {
        logger.info("UriSaasAspect aop");
    }


    @Before("executeService() && @annotation(uriSaas)")
    public Object getSimpleCache(ProceedingJoinPoint pjp, UriSaas uriSaas) throws Throwable {
        Object value = null;
        Class<?> returnType = ((MethodSignature) pjp.getSignature()).getReturnType();
        value = JSON.parseObject(value.toString(), returnType);
        return value;
    }


}
