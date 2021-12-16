package com.xqy.controller;

import com.alibaba.fastjson.JSONObject;
import com.xqy.service.after_saleService;
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

public class after_saleController {
    @Autowired
    private after_saleService after_saleService;

    @RequestMapping(value = "trade/after_sale/add",method = RequestMethod.POST)
    public Object add(HttpServletRequest request, HttpSession session){
        JSONObject jsonobject = new JSONObject();
        String traid_id = request.getParameter("traid_id");
        String detail_description = request.getParameter("detail_description");
        String after_sale_rank = request.getParameter("after_sale_rank");
        String require = request.getParameter("require");
        if(after_saleService.add(Integer.parseInt(traid_id),detail_description,Integer.parseInt(after_sale_rank),require)==0){
            jsonobject.put(Consts.CODE,0);
            jsonobject.put(Consts.MESSAGE,"已经评论过了");

            return jsonobject;
        }
        jsonobject.put(Consts.CODE,1);
        jsonobject.put(Consts.MESSAGE,"成功");

        return jsonobject;
    }
    @RequestMapping(value = "after_sale/selectAll",method = RequestMethod.POST)
    public Object selectAll(HttpServletRequest request){
        return after_saleService.selectAll();
    }
    @RequestMapping(value = "after_sale/returnmoney",method = RequestMethod.POST)
    public Object returnmoney(HttpServletRequest request){
        String id = request.getParameter("id");
        String traid_id = request.getParameter("traid_id");
        System.out.println(id+traid_id);
        after_saleService.returnmoney(Integer.parseInt(id),Integer.parseInt(traid_id));
        return null;
    }






}
