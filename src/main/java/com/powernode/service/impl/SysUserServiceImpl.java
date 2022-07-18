package com.powernode.service.impl;

import com.powernode.common.Result;
import com.powernode.domain.SysUser;
import com.powernode.dto.UserLoginDto;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.powernode.mapper.SysUserMapper;
import com.powernode.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService{

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public Result login(UserLoginDto userLoginDto) {
        SysUser user = sysUserMapper.login(userLoginDto);
        if (user ==null ) {
            return new Result(400,"账号密码错误");
        }
        return  new Result();
    }
}
