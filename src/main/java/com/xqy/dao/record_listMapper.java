package com.xqy.dao;

import com.xqy.domain.record_list;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 数据档案Dao
 */
@Repository
public interface record_listMapper {
    /**
     * 增加
     */
    public record_list add(String record_liat_name, String owner_account, Date start_time);
    /**
     * 修改
     */
    public int update(record_list record_list);
    /**
     * 删除
     */
    public void delete(Integer id);
    /**
     * 根据主键查某个对象
     */
    public record_list seleteById(Integer id);
    /**
     * 查询所有所有
     */
    public List<record_list> allRecordList();
    /**
     * 根据记录创建者查询
     */
    public List<record_list> recordOfOwnner (String account);

    /**
     * recordOfOwnnerByName
     */
    public List<record_list> recordOfOwnnerByName(String account, String name);
}
