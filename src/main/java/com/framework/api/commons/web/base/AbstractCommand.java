package com.framework.api.commons.web.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令接口请求抽象类,所有接口的command均需实现该抽象类
 * <p/>
 *
 * @author <a href="mailto:zhangraty@gmail.com">Raty Zhang</a>
 * @version Date: 2017年9月5日 下午4:26:16
 * @serial 1.0
 * @since 2017年9月5日 下午4:26:16
 */
public abstract class AbstractCommand implements ICommand {
    protected final Logger LOG = LoggerFactory.getLogger(getClass());

    @Override
    public ApiResponse execute(ApiRequest req) throws ApiException {
        return new ApiResponse(RespCode.API_NOT_EXIST);
    }
}
