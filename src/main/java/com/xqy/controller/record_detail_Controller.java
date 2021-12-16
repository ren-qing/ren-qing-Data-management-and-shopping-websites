package com.xqy.controller;

import com.alibaba.fastjson.JSONObject;
import com.xqy.service.record_detaiService;
import com.xqy.utils.Consts;
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
 * @ RestController返回json
 */
@RestController

public class record_detail_Controller {
    @Autowired
    private record_detaiService  record_detaiService;

    /**
     * 添加档案记录
     */
    @RequestMapping(value = "record_detail/add",method = RequestMethod.POST)
    public Object add(HttpServletRequest request){
        JSONObject jsonobject = new JSONObject();
        String tempreture_high = request.getParameter("tempreture_high").trim();
        String wet = request.getParameter("wet").trim();
        String record_id = request.getParameter("record_id").trim();
        String tempreture_low = request.getParameter("tempreture_low").trim();
        String time = request.getParameter("time");
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
        System.out.println(start_time.toString());
        return  record_detaiService.add( Double.parseDouble(tempreture_high), Double.parseDouble(wet),  Double.parseDouble(tempreture_low),  Integer.parseInt(record_id), start_time);
    }

    /**
     * 返回档案数据
     * @param request
     * @return
     */
    @RequestMapping(value = "record_detail/showbyid",method = RequestMethod.POST)
    public Object showbyid(HttpServletRequest request){
        String record_id = request.getParameter("record_id");
        return record_detaiService.showbyid(Integer.parseInt(record_id));
    }






}
