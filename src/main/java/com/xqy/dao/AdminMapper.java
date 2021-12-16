package com.xqy.dao;

import com.xqy.domain.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户Dao
 * 数据库接口
 * 要有对应的xml文件在里面写sql 在resources的mapper文件夹里写sql
 * @Repository 方便service层调用
 */
@Repository
public interface AdminMapper {
    /*验证密码是否正确*/
    public int verifyPassword(String account,String password);
    List<Admin> selectAll();
}
