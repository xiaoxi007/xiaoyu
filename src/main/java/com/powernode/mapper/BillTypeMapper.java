package com.powernode.mapper;

import com.powernode.common.Result;
import com.powernode.domain.BillType;
import com.powernode.dto.BillTypeDto;

import java.util.List;

public interface BillTypeMapper {
    /**
     * 显示所有的类型
     *
     * @return
     */
    List<BillType> selectAll();
}