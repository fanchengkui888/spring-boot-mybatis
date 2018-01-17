package com.jk.controller;

import com.jk.model.DingDan;
import com.jk.service.DingDanService;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/8 0008.
 */
@Controller
public class DingDanController {

    @Autowired
    private DingDanService dingDanService;

    //跳到index页面，也就是首页
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/dingdan")
    public String dingdan(){
        return "dingdanlist";
    }

    @RequestMapping("/queryDingDan")
    @ResponseBody
    public Map<String, Object> queryDingDan(int page, int rows){
//        Map map = dingDanService.getAll(page,rows);
        Map<String, Object> map = dingDanService.getAll(page,rows);
        System.out.println(map);
        return map;
    }



    @RequestMapping("/add")
    public void insert(){
        DingDan dingDan = new DingDan();
        dingDan.setDname("11112332");
        dingDanService.insert(dingDan);
    }
//-----------------------------------------Httpclient  TEST---------------------------------------------------------------------

}
