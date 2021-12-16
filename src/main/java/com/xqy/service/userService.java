package com.xqy.service;

/**
 * 用户service接口
 *
 */
public interface userService {
    /**验证密码是否正确*/
    public boolean verifyPassword(String account,String password);
    /**获取钱包*/
    public Double getWallet(String account);
    /**获取信用评分*/
    public Double getRank(String account);
    /**修改密码*/
    public boolean changePass(String account,String newpass);
    /**注册*/
    void register(String account, String pass, String name);
    /**获取有无该用户账号*/
    Integer haveone(String account);

    void addmoneyto(String account, double money);

    Integer deletemoneyto(String account, double money);
}
