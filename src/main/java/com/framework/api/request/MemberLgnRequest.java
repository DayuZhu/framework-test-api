package com.framework.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 功能描述:
 *
 * @className:MemberLgnRequest
 * @projectName:20190515-weekend-product-api
 * @author:Dayu
 * @date: 2020/9/14 11:07
 */
@ApiModel(value = "会员登录手机号收集请求参数", description = "会员登录手机号收集请求参数")
public class MemberLgnRequest {

    @ApiModelProperty(value = "用户ID")
    @NotNull
    @Min(1)
    private Integer memberId;

    @ApiModelProperty(value = "用户登录手机号")
    @NotBlank
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "请输入正确的手机号")
    private String lgnMobile;


    @NotNull
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(@NotNull Integer memberId) {
        this.memberId = memberId;
    }

    public String getLgnMobile() {
        return lgnMobile;
    }

    public void setLgnMobile(String lgnMobile) {
        this.lgnMobile = lgnMobile;
    }
}
