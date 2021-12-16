package com.xqy.service;

import com.xqy.domain.item;
import com.xqy.domain.record_list;

import java.util.List;

/**
 * 用户service接口
 *
 */
public interface itemService {
    /**验证密码是否正确*/
    public item itemDetail(Integer id);

    public List<item> itemOfOwnner(String account);

    item add(String owner_account, Double perPrice, String item_name,Integer record_id,Integer total);

    public List<item> itemofname(String account, String name);

    public List<item> itemShop(String name);

    public void offsale(int id);
}
