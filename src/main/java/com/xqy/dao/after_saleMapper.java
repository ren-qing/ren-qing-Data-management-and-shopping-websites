package com.xqy.dao;

import com.xqy.domain.Admin;
import com.xqy.domain.after_sale;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户Dao
 */
@Repository
public interface after_saleMapper {

    /**
     * 注册
     *
     */
    void add(Integer traid_id, String detail_description, Integer after_sale_rank,String require);
    /**
     * 查看是不是被评价过
     */

    public int find(Integer traid_id);

    List<after_sale> selectAll(String require);

    void returnmoney(int id);
}
