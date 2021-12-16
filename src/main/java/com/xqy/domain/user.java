package com.xqy.domain;

import java.io.Serializable;

/**
 * 用户 数据库表 一个类
 */
public class user implements Serializable {
    /*主键*/
    private Integer id;
    /*账户名称*/
    private  String user_name;
    /*账户账号*/
    private  String user_account;
    /*账户密码*/
    private  String user_password;
    /*账户余额*/
    private  Double user_wallet;
    /*账户信誉分*/
    private  Double user_rank;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Double getUser_wallet() {
        return user_wallet;
    }

    public void setUser_wallet(Double user_wallet) {
        this.user_wallet = user_wallet;
    }

    public Double getUser_rank() {
        return user_rank;
    }

    public void setUser_rank(Double user_rank) {
        this.user_rank = user_rank;
    }
}
