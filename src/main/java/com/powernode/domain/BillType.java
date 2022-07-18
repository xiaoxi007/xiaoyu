package com.powernode.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "类型",description = "类型信息")
public class BillType {
    /**
    * 类型id
    */
    @ApiModelProperty(value="类型id")
    private Integer id;

    /**
    * 类型名称
    */
    @ApiModelProperty("类型名称")
    private String name;
}