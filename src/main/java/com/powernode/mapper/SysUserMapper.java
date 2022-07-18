package com.powernode.mapper;

import com.powernode.common.Result;
import com.powernode.domain.SysUser;
import com.powernode.dto.UserLoginDto;

public interface SysUserMapper {
    /**
     * 处理登录请求方法
     * @param userLoginDto
     * @return
     */
    SysUser login(UserLoginDto userLoginDto);
}