package com.powernode.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserLoginDto {
    /**
     * 登录账号
     */
    @ApiModelProperty(value="登录账号")
    private String name;
    /**
     * 登录密码
     */
    @ApiModelProperty(value="登录密码")
    private String pwd;
}
