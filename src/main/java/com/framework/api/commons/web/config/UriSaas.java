package com.framework.api.commons.web.config;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UriSaas {
    String value();
}