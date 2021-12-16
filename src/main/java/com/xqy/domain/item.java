package com.xqy.domain;

import java.io.Serializable;

public class item implements Serializable {
    /*主键*/
    private Integer id;
    /*拥有者*/
    private String owner_account;
    /*物品名称*/
    private String item_name;
    /*单价*/
    private Double perPrice;
    /*对应档案id*/
    private Integer record_id;
    /*所有份数*/
    private Integer total;
    /*是否在售*/
    private Integer onsale;
    /*单价*/
    private Double user_rank;

    public Double getUser_rank() {
        return user_rank;
    }

    public void setUser_rank(Double user_rank) {
        this.user_rank = user_rank;
    }

    public Integer getOnsale() {
        return onsale;
    }

    public void setOnsale(Integer onsale) {
        this.onsale = onsale;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    /*剩余份数*/
    private Integer last;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner_account() {
        return owner_account;
    }

    public void setOwner_account(String owner_account) {
        this.owner_account = owner_account;
    }



    public Double getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(Double perPrice) {
        this.perPrice = perPrice;
    }

    public Integer getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Integer record_id) {
        this.record_id = record_id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }
}
