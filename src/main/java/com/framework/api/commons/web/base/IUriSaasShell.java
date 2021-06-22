package com.framework.api.commons.web.base;


public interface IUriSaasShell {
    /**
     *
     */
    void auth(UriRequest uriRequest);

    /**
     * 返回响应信息，UriResponse
     */
    UriResponse execute(UriRequest uriRequest);

}
