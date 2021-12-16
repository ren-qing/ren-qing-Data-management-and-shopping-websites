package com.xqy.controller;

import com.alibaba.fastjson.JSONObject;
import com.xqy.service.userService;
import com.xqy.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ RestController返回json
 */
@RestController

public class itemController {
    @Autowired
    private userService userService;
    /**
     * 判断是否登陆成功
     */
    @RequestMapping(value = "user/login/status",method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonobject = new JSONObject();
        String account = request.getParameter("account");
        String pass = request.getParameter("password");
        boolean flag = userService.verifyPassword(account,pass);
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
    @RequestMapping(value = "user/login/register",method = RequestMethod.POST)
    public Object register(HttpServletRequest request, HttpSession session){
        JSONObject jsonobject = new JSONObject();
        String account = request.getParameter("account");
        String pass = request.getParameter("pass");
        String name = request.getParameter("name");
        if(userService.haveone(account)>0){
            jsonobject.put(Consts.CODE,0);
        }else{
            userService.register(account,pass,name);
            jsonobject.put(Consts.CODE,1);
        }
        return jsonobject;
    }
    @RequestMapping(value = "user/wallet",method = RequestMethod.POST)
    public Object getWallet(HttpServletRequest request,HttpSession session){
        JSONObject jsonObject = new JSONObject();
        String account = request.getParameter("account");
        Double wallet = userService.getWallet(account);
        jsonObject.put("wallet",wallet);
        return jsonObject;
    }

    @RequestMapping(value = "user/rank",method = RequestMethod.POST)
    public Object getRank(HttpServletRequest request,HttpSession session){
        JSONObject jsonObject = new JSONObject();
        String account = request.getParameter("account");
        Double rank = userService.getRank(account);
        jsonObject.put("rank",rank);
        return jsonObject;
    }

    @RequestMapping(value = "user/changePass",method = RequestMethod.POST)
    public Object changePass(HttpServletRequest request,HttpSession session) {
        JSONObject jsonobject = new JSONObject();
        String account = request.getParameter("account");
        String oldpass = request.getParameter("oldPassword");
        String newpass = request.getParameter("newPassword");
        boolean flag = userService.verifyPassword(account, oldpass);
        if (flag) {
            jsonobject.put(Consts.CODE, 1);
            userService.changePass(account, newpass);
            jsonobject.put(Consts.MESSAGE, "修改成功");
            session.setAttribute(Consts.ACCOUNT, account);
            return jsonobject;
        }
        jsonobject.put(Consts.CODE, 0);
        jsonobject.put(Consts.MESSAGE, "账号或密码错误");
        return jsonobject;
    }
    @RequestMapping(value = "user/addmoneyto",method = RequestMethod.POST)
    public Object addmoneyto(HttpServletRequest request, HttpSession session){
        JSONObject jsonobject = new JSONObject();
        String account = request.getParameter("account");
        String money = request.getParameter("money");
        if(userService.haveone(account)>0){
            userService.addmoneyto(account,Double.parseDouble(money));
            jsonobject.put(Consts.CODE,1);
            return  jsonobject;
        }
        jsonobject.put(Consts.CODE,0);
        return jsonobject;
    }
    @RequestMapping(value = "user/deletemoneyto",method = RequestMethod.POST)
    public Object deletemoneyto(HttpServletRequest request, HttpSession session){
        JSONObject jsonobject = new JSONObject();
        String account = request.getParameter("account");
        String money = request.getParameter("money");
        if(userService.haveone(account)>0){
            if(userService.deletemoneyto(account,Double.parseDouble(money))==1){
                jsonobject.put(Consts.CODE, 1);
            }else{
                jsonobject.put(Consts.CODE, 0);
            }
            return jsonobject;
        }
        jsonobject.put(Consts.CODE,2);
        return jsonobject;
    }





}
