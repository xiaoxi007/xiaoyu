package com.powernode.service;

import com.powernode.common.Result;
import com.powernode.domain.Bills;
import com.powernode.dto.BillsDto;
import com.powernode.dto.PageDto;

public interface BillsService{


    Result delectById(Integer id);

    Result page(PageDto pageDto);

    Result updateById(BillsDto bills);

    Result add(BillsDto bills);
}
