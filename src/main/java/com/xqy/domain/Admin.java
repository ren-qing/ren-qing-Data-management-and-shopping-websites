package com.xqy.domain;

import java.io.Serializable;

/**
 * 管理员 数据库表 一个类
 * Serializable 序列化 通过序列化一个对象，将其写入磁盘，以后在程序再次调用时重新恢复那个对象，就能圆满实现一种“持久”效果。 该接口仅是一个标记，没有方法
 */
public class Admin implements Serializable {
    /*主键*/
    private Integer id;
    /*账户*/
    private  String admin_account;
    /*账户密码*/
    private  String admin_password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdmin_account() {
        return admin_account;
    }

    public void setAdmin_account(String admin_account) {
        this.admin_account = admin_account;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }
}
