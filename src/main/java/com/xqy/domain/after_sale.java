package com.xqy.domain;

import java.io.Serializable;

/**
 * 管理员 数据库表 一个类
 * Serializable 序列化 通过序列化一个对象，将其写入磁盘，以后在程序再次调用时重新恢复那个对象，就能圆满实现一种“持久”效果。 该接口仅是一个标记，没有方法
 */
public class after_sale implements Serializable {
    /*主键*/
    private Integer id;
    /*交易ID*/
    private Integer traid_id;
    /*详细评价*/
    private String detail_description;
    /*评分*/
    private Integer after_sale_rank;
    /*需求*/
    private String require;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTraid_id() {
        return traid_id;
    }

    public void setTraid_id(Integer traid_id) {
        this.traid_id = traid_id;
    }

    public String getDetail_description() {
        return detail_description;
    }

    public void setDetail_description(String detail_description) {
        this.detail_description = detail_description;
    }

    public Integer getAfter_sale_rank() {
        return after_sale_rank;
    }

    public void setAfter_sale_rank(Integer after_sale_rank) {
        this.after_sale_rank = after_sale_rank;
    }

    public String getRequire() {
        return require;
    }

    public void setRequire(String require) {
        this.require = require;
    }
}
