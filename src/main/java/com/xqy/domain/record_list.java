package com.xqy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 记录档案 数据库表 一个类 跟数据库的对应关系
 * Serializable序列化
 */
public class record_list implements Serializable {
    /*主键*/
    private Integer id;
    /*档案名称*/
    private  String record_liat_name;
    /*档案开始时间*/
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date start_time;
    /*创建人账号*/
    private  String owner_account;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecord_liat_name() {
        return record_liat_name;
    }

    public void setRecord_liat_name(String record_liat_name) {
        this.record_liat_name = record_liat_name;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public String getOwner_account() {
        return owner_account;
    }

    public void setOwner_account(String owner_account) {
        this.owner_account = owner_account;
    }
}
