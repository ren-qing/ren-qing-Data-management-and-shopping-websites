package com.xqy.service;

import com.xqy.domain.after_sale;

import java.util.List;

/**
 * 用户service接口
 *
 */
public interface after_saleService {
    /**add*/
    Integer add(Integer traid_id, String detail_description, Integer after_sale_rank,String require);

    List<after_sale> selectAll();

    void returnmoney(int id, int traid_id);
}
