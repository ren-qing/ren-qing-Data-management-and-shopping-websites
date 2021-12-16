package com.xqy.service.impl;

import com.xqy.dao.itemMapper;
import com.xqy.dao.userMapper;
import com.xqy.domain.item;
import com.xqy.service.itemService;
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
public class itemServiceImpl implements itemService {
    @Autowired
    private itemMapper itemMapper;
    /**
     * 验证密码是否正确
     *
     * @param id
     */
    @Override
    public item itemDetail(Integer id) {
        return itemMapper.itemDetail(id);
    }

    @Override
    public List<item> itemOfOwnner(String account) {
        return itemMapper.itemOfOwnner(account);
    }

    @Override
    public item add(String owner_account, Double perPrice, String item_name,Integer record_id,Integer total) {
        return itemMapper.add(owner_account, perPrice,  item_name,record_id,total);
    }

    @Override
    public List<item> itemofname(String account, String name) {
        return itemMapper.itemofname(account,name);
    }

    @Override
    public List<item> itemShop(String name) {
        return itemMapper.itemShop(name);
    }

    @Override
    public void offsale(int id) {
        itemMapper.offsale(id);
    }


}
