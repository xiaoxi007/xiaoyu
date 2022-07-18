package com.powernode.domain;

import lombok.Data;

@Data
public class SysUser {
    /**
    * 类型id
    */
    private Integer id;

    /**
    * 用户名称
    */
    private String name;

    /**
    * 登录名称
    */
    private String loginname;

    /**
    * 密码
    */
    private String pwd;
}