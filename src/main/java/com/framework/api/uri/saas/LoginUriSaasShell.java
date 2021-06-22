package com.framework.api.uri.saas;

import com.framework.api.commons.web.base.AbstractAuthUriSaasShell;
import com.framework.api.commons.web.base.UriRequest;
import com.framework.api.commons.web.base.UriResponse;
import org.springframework.stereotype.Component;

/**
 * 功能描述:
 *
 * @className:LoginUriSaasMth
 * @projectName:framework-test-api
 * @author:Dayu
 * @date: 2021/5/28 17:03
 */
@Component
public class LoginUriSaasShell extends AbstractAuthUriSaasShell {

    @Override
    public UriResponse execute(UriRequest uriRequest) {

        UriResponse uriResponse = new UriResponse();
        uriResponse.setRetCode("0");
        uriResponse.setRetMsg("操作成功");
        uriResponse.setData(uriRequest.getData());
        return uriResponse;

    }


}
