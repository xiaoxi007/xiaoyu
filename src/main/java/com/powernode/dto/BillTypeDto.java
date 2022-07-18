package com.powernode.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BillTypeDto {
    @ApiModelProperty(value="类型id")
    private Integer id;
    @ApiModelProperty(value="类型名称")
    private String name;
}
