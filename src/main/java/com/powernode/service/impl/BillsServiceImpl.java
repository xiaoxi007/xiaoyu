package com.powernode.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.powernode.common.PageInfo;
import com.powernode.common.Result;
import com.powernode.domain.Bills;
import com.powernode.dto.BillsDto;
import com.powernode.dto.PageDto;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.powernode.mapper.BillsMapper;
import com.powernode.service.BillsService;

import java.util.List;

@Service
public class BillsServiceImpl implements BillsService{

    @Resource
    private BillsMapper billsMapper;

    @Override
    public Result delectById(Integer id) {
        Integer integer = billsMapper.delectById(id);
        if (integer ==0) {
            return new Result(400,"删除失败");
        }

        return new Result() ;
    }

    @Override
    public Result page(PageDto pageDto) {
        Page<Bills> pages = PageHelper.startPage(pageDto.getPage(), pageDto.getLimit());
        List<Bills> page = billsMapper.page(pageDto);
        return new Result(new PageInfo(pages));
    }

    @Override
    public Result updateById(BillsDto bills) {
        Integer integer = billsMapper.updateById(bills);
        if (integer ==0) {
            return new Result(400,"删除失败");
        }
        return new Result();
    }

    @Override
    public Result add(BillsDto bills) {
        return new Result(billsMapper.add(bills)) ;
    }

}
