package com.xqy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class trade implements Serializable {
    /*主键*/
    private Integer id;
    /*商家账号*/
    private String saleman_account;
    /*买家账号*/
    private String buyer_account;
    /*商品id*/
    private Integer item_id;
    /*交易创建时间*/
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date time;

    private user user;
    private item item;

    public com.xqy.domain.item getItem() {
        return item;
    }

    public void setItem(com.xqy.domain.item item) {
        this.item = item;
    }

    public com.xqy.domain.user getUser() {
        return user;
    }

    public void setUser(com.xqy.domain.user user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSaleman_account() {
        return saleman_account;
    }

    public void setSaleman_account(String saleman_account) {
        this.saleman_account = saleman_account;
    }

    public String getBuyer_account() {
        return buyer_account;
    }

    public void setBuyer_account(String buyer_account) {
        this.buyer_account = buyer_account;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getFinalPries() {
        return finalPries;
    }

    public void setFinalPries(Double finalPries) {
        this.finalPries = finalPries;
    }

    /*交易数量*/
    private Integer quantity;
    /*成交价*/
    private Double finalPries;

}
