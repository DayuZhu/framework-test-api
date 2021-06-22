package com.framework.api.request;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 功能描述:
 *
 * @className:UserRequest
 * @projectName:framework-test-api
 * @author:Dayu
 * @date: 2021/5/27 18:16
 */
public class UserRequest {
    @NotBlank
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
