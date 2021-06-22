package com.framework.api.commons.web.base;

import com.framework.api.commons.web.enums.ResultEnum;


/**
 * 命令接口请求抽象类,所有接口的command均需实现该抽象类
 * <p/>
 *
 * @author <a href="mailto:zhangraty@gmail.com">Raty Zhang</a>
 * @version Date: 2017年9月5日 下午4:26:16
 * @serial 1.0
 * @since 2017年9月5日 下午4:26:16
 */
public abstract class AbstractUriSaasShell implements IUriSaasShell {

    @Override
    public UriResponse execute(UriRequest uriRequest) {
        throw new BaseRuntimeException(ResultEnum.URI_NOT_EXIST);
    }

}
