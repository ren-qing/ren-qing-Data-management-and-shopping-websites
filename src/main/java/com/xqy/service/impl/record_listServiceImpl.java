package com.xqy.service.impl;

import com.xqy.dao.record_listMapper;
import com.xqy.domain.record_list;
import com.xqy.service.record_listService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 数据档案实现类
 */
@Service
public class record_listServiceImpl implements record_listService {
    @Autowired
    private record_listMapper record_listMapper;


    /**
     * 增加
     *
     * @param record_liat_name
     * @param owner_account
     * @param start_time
     */
    @Override
    public record_list add(String record_liat_name, String owner_account, Date start_time) {
         return record_listMapper.add(record_liat_name,owner_account,start_time);
    }

    /**
     * 修改
     *
     * @param record_list
     */
    @Override
    public boolean update(record_list record_list) {
        return record_listMapper.update(record_list) >0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public void delete(Integer id) {
        record_listMapper.delete(id) ;
    }

    /**
     * 根据主键查某个对象
     *
     * @param id
     */
    @Override
    public record_list seleteById(Integer id) {
        return record_listMapper.seleteById(id);
    }

    /**
     * 查询所有所有
     */
    @Override
    public List<record_list> allRecordList() {
        return record_listMapper.allRecordList();
    }

    /**
     * 根据记录创建者查询
     *
     * @param account
     */
    @Override
    public List<record_list> recordOfOwnner(String account) {
        return record_listMapper.recordOfOwnner(account);
    }

    /**
     * recordOfOwnnerByName
     *
     * @param account
     * @param name
     */
    @Override
    public List<record_list> recordOfOwnnerByName(String account, String name) {
        return record_listMapper.recordOfOwnnerByName(account,name);
    }
}
