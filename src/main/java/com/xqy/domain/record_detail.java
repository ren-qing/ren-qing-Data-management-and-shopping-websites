package com.xqy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class record_detail implements Serializable {
    /*主键*/
    private Integer id;

    /*发布时间*/
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date time;

    /*最高温*/
    private Double tempreture_high;

    /*湿度*/
    private Double wet;

    /*档案ID*/
    private Integer record_id;

    /*最低温*/
    private Double tempreture_low;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getTempreture_high() {
        return tempreture_high;
    }

    public void setTempreture_high(Double tempreture_high) {
        this.tempreture_high = tempreture_high;
    }

    public Double getWet() {
        return wet;
    }

    public void setWet(Double wet) {
        this.wet = wet;
    }

    public Integer getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Integer record_id) {
        this.record_id = record_id;
    }

    public Double getTempreture_low() {
        return tempreture_low;
    }

    public void setTempreture_low(Double tempreture_low) {
        this.tempreture_low = tempreture_low;
    }
}
