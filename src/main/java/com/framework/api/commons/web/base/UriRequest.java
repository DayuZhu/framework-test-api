package com.framework.api.commons.web.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * api接口请求类
 */
@ApiModel(description = "小生活同步Api请求体")
public class UriRequest<T> {
    @ApiModelProperty(value = "方法命令")
    @NotBlank
    private String sh;

    private T data;

    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
