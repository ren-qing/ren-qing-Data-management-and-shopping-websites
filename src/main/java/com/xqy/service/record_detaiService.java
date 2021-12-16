package com.xqy.service;

import com.xqy.domain.record_detail;

import java.util.Date;
import java.util.List;

/**
 * 用户service接口
 *
 */
public interface record_detaiService {

    /**添加档案数据*/
    public record_detail add(Double tempreture_high,Double wet, Double tempreture_low, Integer record_id, Date time);

    public List<record_detail> showbyid(Integer record_id);
}
