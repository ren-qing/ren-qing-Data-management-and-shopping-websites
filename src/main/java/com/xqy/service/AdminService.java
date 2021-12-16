package com.xqy.service;

import com.xqy.domain.Admin;
import com.xqy.domain.after_sale;
import com.xqy.domain.trade;

import java.util.List;

/**
 * 用户的Service接口
 */

public interface AdminService {
    /**验证密码是否正确*/
    public boolean verifyPassword(String account,String password);

}
