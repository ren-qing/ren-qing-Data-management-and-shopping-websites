package com.xqy.service.impl;

import com.xqy.dao.record_detailMapper;
import com.xqy.dao.userMapper;
import com.xqy.domain.record_detail;
import com.xqy.domain.record_list;
import com.xqy.service.record_detaiService;
import com.xqy.service.record_listService;
import com.xqy.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 用户service的实现类
 * @Service表明是个service 可供调用
 * @Autowired 可以直接调用
 */
@Service
public class record_detaiServiceImpl implements record_detaiService

{

    //用于调用Mapper里的东西
    @Autowired
    private record_detailMapper record_detailMapper;

    /**
     * 添加档案数据
     *
     * @param tempreture_high
     * @param wet
     * @param tempreture_low
     * @param record_id
     * @param time
     */
    @Override
    public record_detail add(Double tempreture_high, Double wet, Double tempreture_low, Integer record_id, Date time) {
        return record_detailMapper.add(tempreture_high,wet,tempreture_low,record_id,time);
    }

    @Override
    public List<record_detail> showbyid(Integer record_id) {
        return record_detailMapper.showbyid(record_id);
    }
}
