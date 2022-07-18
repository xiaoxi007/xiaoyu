package com.powernode.common;

import com.github.pagehelper.Page;
import lombok.Data;

import java.util.List;

/**
 * 描述: 自定义的分页信息
 * 作者: Mr.T
 * 时间: 2022-07-05 14:58
 */
@Data
public class PageInfo {
    /**
     * 页码
     */
    private Integer page;
    /**
     * 每页条数
     */
    private Integer limit;

    /**
     * 总页数
     */
    private Integer pages;
    /**
     * 总条数
     */
    private Long total;

    /**
     * 具体的数据
     */
    private List data;


    public PageInfo(Page page){
        this.page = page.getPageNum();
        this.limit = page.getPageSize();
        this.pages = page.getPages();
        this.total = page.getTotal();
        this.data = page.getResult();
    }
}
