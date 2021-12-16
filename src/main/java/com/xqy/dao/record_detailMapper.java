package com.xqy.dao;

import com.xqy.domain.record_detail;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 用户Dao
 */
@Repository
public interface record_detailMapper {

    /**添加档案数据*/
    public record_detail add(Double tempreture_high, Double wet, Double tempreture_low, Integer record_id, Date time);

    public List<record_detail> showbyid(Integer record_id);
}
