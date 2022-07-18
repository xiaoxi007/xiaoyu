package com.powernode.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.powernode.common.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PageDto  {
    /**
    * 记账时间
    */

    private List<Date> billTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date billTime1;
    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date billTime2;

    /**
    * 引用bill_type表主键
    */
    private Integer typeId;
    /**
     * 页码
     */
    private Integer page = 1;

    /**
     * 每页条数
     */
    private Integer limit = 10;


}