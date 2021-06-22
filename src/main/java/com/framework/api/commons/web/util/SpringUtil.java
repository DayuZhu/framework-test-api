package com.framework.api.commons.web.util;

import org.springframework.context.ApplicationContext;

/**
 * 功能描述:
 *
 * @param <T>
 * @className:SpringUtil
 * @projectName:framework-test-api
 * @author:Dayu
 * @date: 2021/6/1 17:12
 */
public class SpringUtil<T> {


    private static ApplicationContext ac = null;

    private static ApplicationContext getApplicationContext() {
        return ac;
    }

    public static void setApplicationContext(ApplicationContext ac) {
        SpringUtil.ac = ac;
    }

    public static <T> T getBean(String name, Class<T> requiredType) {
        return getApplicationContext().getBean(name, requiredType);
    }

}
