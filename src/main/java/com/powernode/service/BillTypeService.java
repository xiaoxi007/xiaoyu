package com.powernode.service;

import com.powernode.common.Result;
import com.powernode.dto.BillTypeDto;

public interface BillTypeService{

    /**
     * 查询类型的方法
     * @param billTypeDto
     * @return
     */
    Result select();
}
