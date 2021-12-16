package com.xqy.service.impl;

import com.xqy.dao.tradeMapper;
import com.xqy.domain.trade;
import com.xqy.service.tradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class tradeServiceImple implements tradeService {

    @Autowired
    private tradeMapper tradeMapper;
    /**
     * 获取买入的交易记录
     *
     * @param buyer_account
     * @return
     */
    @Override
    public List<trade> buyedList(String buyer_account) {
        System.out.println(tradeMapper.buyedList(buyer_account));
        return tradeMapper.buyedList(buyer_account);
    }

    /**
     * 获取卖出的交易记录
     *
     * @param saleman_account
     */
    @Override
    public List<trade> salededList(String saleman_account) {
        System.out.println(tradeMapper.salededList(saleman_account));
        return tradeMapper.salededList(saleman_account);
    }

    /**
     * 获取卖出的交易记录
     *
     * @param account
     */
    @Override
    public Double buyedCost(String account) {
        return tradeMapper.buyedCost(account);
    }

    /**
     * 获取卖出的交易记录
     *
     * @param account
     */
    @Override
    public Double saledCost(String account) {
        return tradeMapper.saledCost(account);
    }

    /**
     * 根据商品名称搜索
     *
     * @param name
     */
    @Override
    public List<trade> allinbyname(String account,String name) {
        return tradeMapper.allinbyname(account,name);
    }

    @Override
    public List<trade> alloutbyname(String account, String name) {
        return tradeMapper.alloutbyname(account,name);
    }

    @Override
    public void add(Integer quantity, String saleman_account, String buyer_account, Integer item_id, Date time, Double finalPries) {

        System.out.println(time);
        tradeMapper.buydelete(item_id,quantity);
        tradeMapper.buydelete2(saleman_account,finalPries);
        tradeMapper.buydelete3(buyer_account,finalPries);
        tradeMapper.add(quantity,saleman_account,buyer_account,item_id,time,finalPries);
        System.out.println(finalPries);

    }

    @Override
    public Integer returnamount(String id1) {
        Integer id = Integer.parseInt(id1);
        return tradeMapper.returnamount(id);
    }
}
