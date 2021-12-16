package com.xqy.service;

import com.xqy.domain.trade;

import java.util.Date;
import java.util.List;

public interface tradeService {
    /**
     * 获取买入的交易记录
     */
    public List<trade> buyedList(String buyer_account);
    /**
     * 获取卖出的交易记录
     */
    public List<trade> salededList(String saleman_account);
    /**
     * 获取卖出的交易记录
     */
    public Double buyedCost(String account);
    /**
     * 获取卖出的交易记录
     */
    public Double saledCost(String account);
    /**
     * 根据商品名称搜索
     */
    public List<trade> allinbyname(String account, String name);

    public List<trade> alloutbyname(String account, String name);

    void add(Integer quantity, String saleman_account, String buyer_account, Integer item_id, Date time, Double finalPries);

    Integer returnamount(String id);
}
