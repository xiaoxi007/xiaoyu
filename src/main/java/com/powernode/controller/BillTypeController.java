package com.powernode.controller;

import com.powernode.common.Result;
import com.powernode.dto.BillTypeDto;
import com.powernode.service.BillTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("type")
@Api(value = "消费类型",tags = "类型接口")
public class BillTypeController {

    @Autowired
    private BillTypeService billTypeService;

    @ApiOperation(value = "类型列表")
    @GetMapping("select")
    public Result selectAll(){

       return billTypeService.select();
    }
}
