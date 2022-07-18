package com.powernode.service;

import com.powernode.common.Result;
import com.powernode.dto.UserLoginDto;

public interface SysUserService{

    /**
     * 处理登录请求
     * @param userLoginDto
     * @return
     */
    Result login(UserLoginDto userLoginDto);
}
