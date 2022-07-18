package com.powernode.controller;

import com.powernode.common.Result;
import com.powernode.domain.Bills;
import com.powernode.dto.BillsDto;
import com.powernode.dto.PageDto;
import com.powernode.service.BillsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bills")
@Api(value = "账单",tags = "账单接口")
public class BillsController {

    @Autowired
    private BillsService billsService;


    @PostMapping("delete")
    @ApiOperation(value = "删除")
    public Result delectById(@Param("id") Integer id){
        return new Result(billsService.delectById(id));
    }

    @PostMapping("page")
    @ApiOperation(value = "搜索")
    public Result delectById(PageDto pageDto){
        //过滤初始化是没有选择时间的时的空指针
        if (pageDto.getBillTime() != null) {
            pageDto.setBillTime1(pageDto.getBillTime().get(0));
            pageDto.setBillTime2(pageDto.getBillTime().get(1));
        }
        return new Result(billsService.page(pageDto));
    }

    @PostMapping("update")
    @ApiOperation(value = "修改")
    public Result updateById(@Param("exitFrom") BillsDto bills){
        return new Result(billsService.updateById(bills));
    }



    @PostMapping("add")
    @ApiOperation(value = "添加")
    public Result Add(@Param("addForm") BillsDto bills){
        System.out.println(bills);
        return new Result(billsService.add(bills));
    }
}
