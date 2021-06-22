package com.framework.api.commons.web.base;


import com.framework.api.commons.web.enums.ResultEnum;
import com.framework.api.commons.web.util.AuthUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * cmd基类
 */
public abstract class AbstractAuthUriSaasShell extends AbstractUriSaasShell {


    @Override
    public void auth(UriRequest uriRequest) {
        String sh = uriRequest.getSh();
        if (StringUtils.isBlank(sh) || !AuthUtils.auth(sh)) {
            throw new BaseRuntimeException(ResultEnum.FAIL);
        }
    }


}
