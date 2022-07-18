package com.powernode.service.impl;

import com.powernode.common.Result;
import com.powernode.dto.BillTypeDto;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.powernode.mapper.BillTypeMapper;
import com.powernode.service.BillTypeService;
@Service
public class BillTypeServiceImpl implements BillTypeService{

    @Resource
    private BillTypeMapper billTypeMapper;

    @Override
    public Result select() {
        return new Result(billTypeMapper.selectAll());
    }
}
