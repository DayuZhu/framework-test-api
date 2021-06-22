package com.framework.api.commons.web.base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.framework.api.commons.web.enums.ResultEnum;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Map;

/**
 * api接口请求类
 * <p>
 * <p/>
 *
 * @author <a href="mailto:zhangraty@gmail.com">Raty Zhang</a>
 * @version Date: 2018年12月27日 上午10:38:06
 * @serial 1.0
 * @since 2018年12月27日 上午10:38:06
 */
public class ApiRequest implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 8824093812827411892L;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private Map<String, Object> requestParamMap;
    /**
     * 请求id
     */
    private String reqId;

    /**
     * 设备主板唯一编码
     */
    private String deviceId;
    /**
     * 登陆令牌
     */
    private String token;
    /**
     * 客户端版本号
     */
    private int version;


    public ApiRequest(String reqJsonBody) {
        parseRequest(reqJsonBody);
    }

    /**
     * 解析请求参数
     */
    private void parseRequest(String body) {

        if (StringUtils.isBlank(body)) {
            logger.error("请求参数为空");
            throw new BaseRuntimeException(ResultEnum.PARAM_ERROR);
        }

        requestParamMap = JSON.parseObject(body, new TypeReference<Map<String, Object>>() {
        });

        reqId = getParameter("reqId");
        if (StringUtils.isBlank(reqId)) {
            reqId = RandomStringUtils.randomNumeric(10);
        }
        deviceId = getParameter("deviceId");
        version = getParameterAsInt("versionCode", 0);
        token = getParameter("token");
    }

    public String getParameter(String key) {
        return MapUtils.getString(requestParamMap, key);
    }

    public int getParameterAsInt(String key) {
        return MapUtils.getIntValue(requestParamMap, key, 0);
    }

    public int getParameterAsInt(String key, int defaultValue) {
        return MapUtils.getIntValue(requestParamMap, key, defaultValue);
    }

    public long getParameterAsLong(String key) {
        return MapUtils.getLongValue(requestParamMap, key, 0);
    }

    public long getParameterAsLong(String key, long defaultValue) {
        return MapUtils.getLongValue(requestParamMap, key, defaultValue);
    }

    public double getParameterAsDouble(String key) {
        return MapUtils.getDoubleValue(requestParamMap, key, 0);
    }

    public double getParameterAsDouble(String key, double defaultValue) {
        return MapUtils.getDoubleValue(requestParamMap, key, defaultValue);
    }

    public Map<String, Object> getRequestParamMap() {
        return requestParamMap;
    }

    public String getReqId() {
        return reqId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getToken() {
        return token;
    }

    public int getVersion() {
        return version;
    }

}
