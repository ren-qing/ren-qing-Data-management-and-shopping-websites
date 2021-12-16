package com.xqy.dao;

import com.xqy.domain.item;
import com.xqy.domain.record_list;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * 用户Dao
 */
@Repository
public interface itemMapper {
    /**
     * 验证密码是否正确
     *
     */
    public item itemDetail(Integer id);


    public List<item> itemOfOwnner(String account);
    /**
     * 增加
     * String owner_account = request.getParameter("owner_account").trim();
     *         String perPrice = request.getParameter("perPrice").trim();
     *         String item_name = request.getParameter("item_name").trim();
     *         String record_id = request.getParameter("record_id").trim();
     *         String total = request.getParameter("total").trim();
     */
    public item add(String owner_account, Double perPrice, String item_name,Integer record_id,Integer total);

    public List<item> itemofname(String account, String name);

    public List<item> itemShop(String name);

    void offsale(int id);
}
