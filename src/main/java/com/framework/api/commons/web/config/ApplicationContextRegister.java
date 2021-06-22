package com.framework.api.commons.web.config;

import com.framework.api.commons.web.util.SpringUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @className:ApplicationContextRegister
 * @projectName:framework-test-api
 * @author:Dayu
 * @date: 2021/6/1 17:13
 */
@Component
public class ApplicationContextRegister implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.setApplicationContext(applicationContext);
    }

}
