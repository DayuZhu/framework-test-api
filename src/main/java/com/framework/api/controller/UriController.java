package com.framework.api.controller;

import com.framework.api.commons.web.base.AbstractUriController;
import com.framework.api.commons.web.base.UriRequest;
import com.framework.api.commons.web.base.UriResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 功能描述:
 *
 * @className:ApiController
 * @projectName:framework-test-api
 * @author:Dayu
 * @date: 2021/5/26 17:33
 */

@RestController
@RequestMapping(value = "/product/api")
public class UriController extends AbstractUriController {

    @ApiOperation(value = "会员登录手机号收集")
    @PostMapping
    public UriResponse addMemberLgnMobile(@RequestBody @Valid UriRequest uriRequest) {

        return this.doPost(uriRequest);
    }

}
