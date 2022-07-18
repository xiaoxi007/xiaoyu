package com.powernode.controller;

import com.powernode.common.Result;
import com.powernode.dto.UserLoginDto;
import com.powernode.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Api(value = "用户",tags = "登录接口")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "登录")
    @PostMapping("login")
    public Result login(@Param("loginForm") UserLoginDto userLoginDto){
        Result uesr = sysUserService.login(userLoginDto);
        return uesr;
    }



}
