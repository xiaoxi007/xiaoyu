package com.powernode.mapper;

import com.powernode.common.Result;
import com.powernode.domain.Bills;
import com.powernode.dto.BillsDto;
import com.powernode.dto.PageDto;

import java.util.List;

public interface BillsMapper {
    Integer delectById(Integer id);

    List<Bills> page(PageDto pageDto);

    Integer updateById(BillsDto bills);

    Integer add(BillsDto bills);
}