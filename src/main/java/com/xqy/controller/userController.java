package com.xqy.controller;

import com.alibaba.fastjson.JSONObject;
import com.xqy.service.itemService;
import com.xqy.service.userService;
import com.xqy.utils.Consts;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * user 和 item 搞错了 此为item的控制
 * @ RestController返回json
 */
@RestController

public class userController {
    @Autowired
    private itemService itemService;
    /**
     * 根据item的id返回
     */
    @RequestMapping(value = "item/detail",method = RequestMethod.POST)
    public Object itemDetail(HttpServletRequest request, HttpSession session){
        JSONObject jsonobject = new JSONObject();
        String id = request.getParameter("id").trim();
        return  itemService.itemDetail(Integer.parseInt(id));

    }
    /**
     * 根据记录创建者查询
     */
    @RequestMapping(value = "item/itemOfOwnner",method = RequestMethod.POST)
    public Object itemOfOwnner (HttpServletRequest request){
        String account = request.getParameter("account").trim();
        return itemService.itemOfOwnner(account);
    }
    /**
     * 根据商品名称搜索自己的
     */
    @RequestMapping(value = "item/itemofname",method = RequestMethod.POST)
    public Object itemofname (HttpServletRequest request){
        String account = request.getParameter("account").trim();
        String name = request.getParameter("name").trim();
        return itemService.itemofname(account,name);
    }
    /**
     * 根据商品名称搜索全部的
     */
    @RequestMapping(value = "item/itemShop",method = RequestMethod.POST)
    public Object itemShop (HttpServletRequest request){
        String name = request.getParameter("name").trim();
        return itemService.itemShop(name);
    }
    /**
     * 下架
     */
    @RequestMapping(value = "item/offsale",method = RequestMethod.POST)
    public Object offsale (HttpServletRequest request){
        String id = request.getParameter("id").trim();
        itemService.offsale(Integer.parseInt(id));
        return null;
    }

    /**
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "item/add",method = RequestMethod.POST)
    public Object addItemList(HttpServletRequest request){
        JSONObject jsonobject = new JSONObject();
        String owner_account = request.getParameter("owner_account").trim();
        String perPrice = request.getParameter("perPrice").trim();
        String item_name = request.getParameter("item_name").trim();
        String record_id = request.getParameter("record_id").trim();
        String total = request.getParameter("total").trim();
        itemService.add( owner_account, Double.parseDouble(perPrice),  item_name,Integer.parseInt(record_id),Integer.parseInt(total));
        return  jsonobject;
    }







}
