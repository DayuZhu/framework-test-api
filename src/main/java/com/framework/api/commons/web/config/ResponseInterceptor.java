package com.framework.api.commons.web.config;

import com.framework.api.constant.FrameworkApiConstant;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述:
 *
 * @className:MemberBlockListInterceptor
 * @projectName:2020-12-23-weekend-product-api
 * @author:Dayu
 * @date: 2021/1/7 10:16
 */
@Component
public class ResponseInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.addHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE);
        response.addHeader(FrameworkApiConstant.HTTP_HEADER_X_CONTENT_TYPE_OPTIONS,
                FrameworkApiConstant.HTTP_HEADER_X_CONTENT_TYPE_OPTIONS_VALUE);
        return Boolean.TRUE;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) throws Exception {

    }
}
