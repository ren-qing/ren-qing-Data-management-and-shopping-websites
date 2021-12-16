package com.xqy.service.impl;

import com.xqy.dao.AdminMapper;
import com.xqy.dao.after_saleMapper;
import com.xqy.domain.Admin;
import com.xqy.domain.after_sale;
import com.xqy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service实现类
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    private after_saleMapper after_saleMapper;
    /**
     * 验证密码是否正确
     *
     */
    @Override
    public boolean verifyPassword(String account, String password) {
        return adminMapper.verifyPassword(account,password)>0 ;
    }
}
