package com.xqy.service.impl;

import com.xqy.dao.userMapper;
import com.xqy.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户service的实现类
 * @Service表明是个service 可供调用
 * @Autowired 可以直接调用
 */
@Service
public class userServiceImpl implements userService {

    //用于调用Mapper里的东西
    @Autowired
    private userMapper userMapper;
    /**
     * 验证密码是否正确
     *
     * @param account
     * @param password
     */
    @Override
    public boolean verifyPassword(String account, String password) {
        return userMapper.verifyPassword(account, password)>0 ;
    }

    /**
     * 获取钱包
     *
     * @param account
     */
    @Override
    public Double getWallet(String account) {
        return userMapper.getWallet(account);
    }

    /**
     * 获取信用评分
     *
     * @param account
     */
    @Override
    public Double getRank(String account) {
        return userMapper.getRank(account);
    }

    /**
     * 修改密码
     *
     * @param account
     * @param newpass
     */
    @Override
    public boolean changePass(String account, String newpass) {
        userMapper.changePass(account, newpass);
        return true;
    }

    /**
     * 注册
     *
     * @param account
     * @param pass
     * @param name
     */
    @Override
    public void register(String account, String pass, String name) {
        userMapper.register(account,pass,name);
    }

    @Override
    public Integer haveone(String account) {
       return  userMapper.haveone(account);
    }

    @Override
    public void addmoneyto(String account, double money) {

        userMapper.addmoneyto(account,money);
    }

    @Override
    public Integer deletemoneyto(String account, double money) {
        if(userMapper.ifmuch(account,money)>0){
            userMapper.deletemoneyto(account,money);
            return 1;
        }
        else{
            return 0;
        }

    }
}

