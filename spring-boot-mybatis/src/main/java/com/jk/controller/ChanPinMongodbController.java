package com.jk.controller;

import com.jk.model.ChanPinMongodb;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/11 0011.
 */
@Controller
public class ChanPinMongodbController {

    @Autowired
    private MongoTemplate mongoTemplate;


    //跳页面
    @RequestMapping("/chanpinmongodb")
    public String chanpinmongodb(){
        return "chanpinmongodblist";
    }
    //新增
    @ResponseBody
    @RequestMapping("/saveChanPinMongodb")
    public String saveChanPinMongodb(ChanPinMongodb chanPinMongodb ){
//        ChanPinMongodb chanPinMongodb = new ChanPinMongodb();
        chanPinMongodb.setId(new Date().getTime());
        chanPinMongodb.setCdate(new Date());
        mongoTemplate.save(chanPinMongodb);
        return "success";
    }
    //查询
    @RequestMapping("/queryChanPinMongodb")
    @ResponseBody
    public Map<String, Object> queryChanPinMongodb(Model model){
        List<ChanPinMongodb> list = mongoTemplate.findAll(ChanPinMongodb.class,"chanPinMongodb");
        System.out.println(list);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("rows",list);
        return map;
    }
    //删除
    @RequestMapping("/deletechanpinmongodb")
    @ResponseBody
    public String deletechanpinmongodb(long id){
        ChanPinMongodb chanPinMongodb = new ChanPinMongodb();
        chanPinMongodb.setId(id);
        mongoTemplate.remove(chanPinMongodb);
        return "success";
    }
    //查询准备修改
    @RequestMapping("/toupdatechanpinmongodb")
    public String toupdatechanpinmongodb(Model model,long id){
        ChanPinMongodb chanPinMongodb = mongoTemplate.findById(id,ChanPinMongodb.class);
        model.addAttribute("chanPinMongodb", chanPinMongodb);
        return "updatechanpinmongodb";
    }

    //修改
    @ResponseBody
    @RequestMapping("/updatechanpin")
    public String updatechanpin(ChanPinMongodb chanPinMongodb){
        mongoTemplate.save(chanPinMongodb);
        return "success";
    }


}
