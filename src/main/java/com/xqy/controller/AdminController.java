package com.xqy.controller;

import com.alibaba.fastjson.JSONObject;
import com.xqy.service.AdminService;
import com.xqy.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    /**
     * 判断是否登录成功
     */
    @RequestMapping(value = "admin/login/status",method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonobject = new JSONObject();
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        boolean flag = adminService.verifyPassword(account,password);
        if(flag){
            jsonobject.put(Consts.CODE,1);
            jsonobject.put(Consts.MESSAGE,"登陆成功");
            session.setAttribute(Consts.ACCOUNT,account);
            return jsonobject;
        }
        jsonobject.put(Consts.CODE,0);
        jsonobject.put(Consts.MESSAGE,"账号或密码错误");
        return jsonobject;
    }









}
