package com.xqy.controller;

import com.alibaba.fastjson.JSONObject;
import com.xqy.domain.record_list;
import com.xqy.service.record_listService;
import com.xqy.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
@RestController
@RequestMapping("/record_list")
public class record_listController {
    @Autowired
    private record_listService  record_listService;
    /**
     * 添加数据档案
     */

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addRecordList(HttpServletRequest request){
        JSONObject jsonobject = new JSONObject();
        String record_liat_name = request.getParameter("record_liat_name").trim();
        String owner_account = request.getParameter("owner_account").trim();
        String time = request.getParameter("start_time");
        System.out.println(time);

        DateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start_time = new Date();
        /**
        try {
            start_time = dateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        */

        return  record_listService.add(record_liat_name,owner_account,start_time);
    }
    /**
     * 修改数据档案
     */

    @RequestMapping(value ="/update",method = RequestMethod.POST)
    public Object updateRecordList(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String id = request.getParameter("id").trim();
        String name = request.getParameter("name").trim();
        String start_time = request.getParameter("start_time").trim();
        String owner_account = request.getParameter("owner_account").trim();
        DateFormat dateFormat= new SimpleDateFormat("yyyy-mm-dd");
        Date start_time_date = new Date();
        try {
            start_time_date = dateFormat.parse(start_time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        record_list record_list = new record_list();
        record_list.setId(Integer.parseInt(id));
        record_list.setRecord_liat_name(name);
        record_list.setOwner_account(owner_account);
        record_list.setStart_time(start_time_date);
        boolean flag = record_listService.update(record_list);
        if(flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MESSAGE,"修改成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MESSAGE,"修改失败");
        return jsonObject;
    }

    /**
     * 删除数据档案
     */

    @RequestMapping(value ="/delete",method = RequestMethod.POST)
    public Object deleteRecordList(HttpServletRequest request){
        String id = request.getParameter("id").trim();

        record_listService.delete(Integer.parseInt(id));
        return 1;
    }
    /**
     * 根据主键查某个对象
     */
    @RequestMapping(value ="/seleteById",method = RequestMethod.GET )
    public Object  seleteById(HttpServletRequest request){
        String id = request.getParameter("id").trim();
        return record_listService.seleteById(Integer.parseInt(id));

    }

    /**
     * 查询所有所有
     */
    @RequestMapping(value = "/allRecordList",method = RequestMethod.GET)
    public Object allRecordList(HttpServletRequest request){
        return record_listService.allRecordList();
    }
    /**
     * 根据记录创建者查询
     */
    @RequestMapping(value = "/recordOfOwnner",method = RequestMethod.POST)
    public Object recordOfOwnner (HttpServletRequest request){
        System.out.println("recordodowner");
        String account = request.getParameter("account").trim();
        return record_listService.recordOfOwnner(account);
    }
    /**
     * 根据记录创建者查询
     */
    @RequestMapping(value = "/recordOfOwnnerByName",method = RequestMethod.POST)
    public Object recordOfOwnnerByName (HttpServletRequest request){
        System.out.println("recordOfOwnnerByName");
        String account = request.getParameter("account").trim();
        String name = request.getParameter("name").trim();
        return record_listService.recordOfOwnnerByName(account,name);
    }

}
