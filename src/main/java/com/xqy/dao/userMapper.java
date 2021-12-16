package com.xqy.dao;

import org.springframework.stereotype.Repository;

/**
 * 用户Dao
 */
@Repository
public interface userMapper {
    /**
     * 验证密码是否正确
     *
     */
    public int verifyPassword(String account, String password);

    /**
     * 获得用户账户余额public String
     */
    public  double getWallet(String account);

    /**
     * 获得用户账户余额public String
     */
    public  double getRank(String account);

    /**
     * 验证密码是否正确
     *
     */
    public void changePass(String account, String password);
    /**
     * 注册
     *
     */
    void register(String account, String pass, String name);

    Integer haveone(String account);

    void returnmoney(int id);

    void returnmoney2(int id);

    void addmoneyto(String account, double money);

    void deletemoneyto(String account, double money);

    Integer ifmuch(String account, double money);
}
