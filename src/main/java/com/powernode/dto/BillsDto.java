package com.powernode.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "账单信息",description = "账单信息")
public class BillsDto {
    /**
    * 自动增长
    */
    @ApiModelProperty(value="账单编号")
    private Integer id;

    /**
    * 账单标题
    */
    @ApiModelProperty(value="账单标题")
    private String title;

    /**
    * 记账时间
    */
    @ApiModelProperty(value="记账时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")//写入数据库
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT-8")//渲染数据
    private Date billTime;

    /**
    * 引用bill_type表主键
    */
    @ApiModelProperty(value="引用bill_type表主键")
    private Integer typeId;

    /**
    * 账单金额
    */
    @ApiModelProperty(value="账单金额")
    private Integer price;

    /**
    * 账单说明
    */
    @ApiModelProperty(value="账单说明")
    private String remark;
}