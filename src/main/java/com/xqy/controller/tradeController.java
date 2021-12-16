package com.xqy.controller;

import com.alibaba.fastjson.JSONObject;
import com.xqy.service.tradeService;
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
 *  @ RestController返回json
 */
@RestController
public class tradeController {
    @Autowired
    private tradeService tradeService;
    @RequestMapping(value = "trade/allin",method = RequestMethod.POST)
    public Object selectAllIn(HttpServletRequest request){
        String buyer_account = request.getParameter("buyer_account");
        System.out.println(buyer_account);
        return tradeService.buyedList(buyer_account);
    }
    @RequestMapping(value = "trade/allout",method = RequestMethod.POST)
    public Object selectAllOut(HttpServletRequest request){
        String saleman_account = request.getParameter("saleman_account");
        System.out.println(saleman_account);
        return tradeService.salededList(saleman_account);
    }
    @RequestMapping(value = "trade/allinbyname",method = RequestMethod.POST)
    public Object allinbyname(HttpServletRequest request){

        String account = request.getParameter("account");
        String name = request.getParameter("name");
        return tradeService.allinbyname(account,name);
    }
    @RequestMapping(value = "trade/alloutbyname",method = RequestMethod.POST)
    public Object alloutbyname(HttpServletRequest request){
        String account = request.getParameter("account");
        String name = request.getParameter("name");
        return tradeService.alloutbyname(account,name);
    }
    @RequestMapping(value = "trade/add",method = RequestMethod.POST)
    public Object add(HttpServletRequest request, HttpSession session){
        JSONObject jsonobject = new JSONObject();
        String quantity = request.getParameter("quantity");
        String saleman_account = request.getParameter("saleman_account");
        String buyer_account = request.getParameter("buyer_account");
        String item_id = request.getParameter("item_id");
        String time = request.getParameter("time");
        String perPrice = request.getParameter("perPrice");

        DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start_time = new Date();
        /**
        try {
            start_time = dateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
         */
        System.out.println(start_time);
        tradeService.add(Integer.parseInt(quantity) , saleman_account, buyer_account,
                Integer.parseInt(item_id),start_time,Integer.parseInt(quantity)*Double.parseDouble(perPrice));
        return jsonobject;
    }
    @RequestMapping(value = "trade/alloutCost",method = RequestMethod.POST)
    public Object saledCost(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String account = request.getParameter("account");
        Double saled = tradeService.saledCost(account);
        jsonObject.put("saled",saled);
        return jsonObject;
    }
    @RequestMapping(value = "trade/allinCost",method = RequestMethod.POST)
    public Object buyedCost(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String account = request.getParameter("account");
        Double buyed = tradeService.buyedCost(account);
        jsonObject.put("buyed",buyed);
        return jsonObject;
    }
    @RequestMapping(value = "trade/returnamount",method = RequestMethod.POST)
    public Object returnamount(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String id = request.getParameter("id");
        Integer returnamount = tradeService.returnamount(id);
        jsonObject.put("returnamount",returnamount);
        return jsonObject;
    }

}
