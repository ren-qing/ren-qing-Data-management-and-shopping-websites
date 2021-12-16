package com.xqy.dao;

import com.xqy.domain.trade;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 交易DAO
 */
@Repository
public interface tradeMapper {
    /**
     * 获取买入的交易记录
     */
    public List<trade> buyedList(String buyer_account);

    public List<trade> salededList(String saleman_account);

    public Double saledCost(String account);
    public Double buyedCost(String account);

    public List<trade> allinbyname(String account,String name);

    public List<trade> alloutbyname(String account,String name);
    void buydelete(int id, int amount);
    void buydelete2(String saleman_account, double finalPries);
    void buydelete3(String buyer_account, double finalPries);

    void add(int quantity, String saleman_account, String buyer_account, int item_id, Date time, double finalPries);

    void returnmoney(int traid_id);

    void returnmoney2(int traid_id);

    Integer returnamount(Integer id);

    void setrank(int traid_id);
}
