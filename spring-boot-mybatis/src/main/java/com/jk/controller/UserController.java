package com.jk.controller;

import com.jk.model.QuDao;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/9 0009.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //跳到jsonp展示页面
    @RequestMapping("/JsonpTest")
    public String JsonpTestList(){
        return "JsonpTestList";
    }



    //跳到潜客展示页面
    @RequestMapping("/Userqianke")
    public String Userqianke(){
        return "qiankelist";
    }
    //查询潜客展示页面
    @RequestMapping("/queryUser")
    @ResponseBody
    public Map<String ,Object> queryUser(int page,int rows){
        Map map = userService.queryUser(page,rows);
        System.out.println(map);
        return map;
    }
    //新增潜客
    @RequestMapping("/addqianke")
    @ResponseBody
    public String addqianke(User user){
        user.setUserdate(new Date());
        userService.insertqianke(user);
        return "success";
    }
    //去查询潜客准备修改
    @RequestMapping("/toupdateqianke")
     public String toupdateqianke(Model model, String id, String jid, String did){
//        Map<String,Object> map = new HashMap<String,Object>();
        System.out.println("did="+did);
        List<QuDao> qudaoslist = userService.queryQuDao(did);
        User users = userService.queryUsers(id);
 //        map.put("rows",list);
        System.out.println(qudaoslist);
        model.addAttribute("qudaoslist", qudaoslist);
        System.out.println(model);
        return "updateqianke";
    }


}
