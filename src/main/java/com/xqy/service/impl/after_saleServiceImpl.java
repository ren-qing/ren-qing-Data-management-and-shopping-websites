package com.xqy.service.impl;

import com.xqy.dao.after_saleMapper;
import com.xqy.dao.tradeMapper;
import com.xqy.dao.userMapper;
import com.xqy.domain.after_sale;
import com.xqy.service.after_saleService;
import com.xqy.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service的实现类
 * @Service表明是个service 可供调用
 * @Autowired 可以直接调用
 */
@Service
public class after_saleServiceImpl implements after_saleService {

    //用于调用Mapper里的东西
    @Autowired
    private after_saleMapper after_saleMapper;
    @Autowired
    private userMapper userMapper;
    @Autowired
    private tradeMapper tradeMapper;

    /**
     * add
     *
     * @param traid_id
     * @param detail_description
     * @param after_sale_rank
     * @param require
     */
    @Override
    public Integer add(Integer traid_id, String detail_description, Integer after_sale_rank, String require) {
        if(after_saleMapper.find(traid_id)>0){
            return 0;
        }
        after_saleMapper.add(traid_id,detail_description,after_sale_rank,require);
        System.out.println("addAfterSale");
        return  1;
    }

    @Override
    public List<after_sale> selectAll() {
        return after_saleMapper.selectAll("退款");
    }

    @Override
    public void returnmoney(int id , int traid_id) {
        //改标记
        after_saleMapper.returnmoney(id);
        System.out.println("改标记");
        //退钱
        tradeMapper.returnmoney(traid_id);
        System.out.println("returnmoney");
        tradeMapper.returnmoney2(traid_id);
        System.out.println("returnmoney2");
        //改评分
        tradeMapper.setrank(traid_id);
    }
}
