package com.jk.controller;

import com.jk.model.JinRong;
import com.jk.util.HttpUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/16 0016.
 */
@Controller
public class HeiHtttpclientController {

    //跳到htttpclient展示页面(黑名单)
    @RequestMapping("/HeiHtttpclient")
    public String  HeiHtttpclient(){
        return "HeiHtttpclientList";
    }

    /**
     * 发送 post请求访问本地应用并根据传递参数不同返回不同结果
     */



    @RequestMapping("/queryHeiHttpclent")
//    @ResponseBody
    public void sendGetmap(PrintWriter out){
        Map maps=new HashMap<>();
        List<String> lists=new ArrayList<>();
        String url="http://localhost:8080/queryHeiHttpclent";
        Map<String, Object> map = HttpUtil.sendGetmap(url);
        System.out.println(map);
//        System.out.println(map.get("result").toString());
//        String[] results = map.get("result").toString().split(",");
//        maps.put("total",4);
//        maps.put("rows",map.get("result").toString());

//        JSONArray result1 = JSONArray.fromObject(map.get("result").toString());
//        JSONArray result1 = JSONArray.fromObject(map);
        JSONObject result1 = JSONObject.fromObject(map);
        System.out.println(result1);

//        super.outString(EntityUtils.toString(entity),responsed);
//        List<JinRong> result =(List<JinRong>)map.get("result");
        out.print(result1);
    }
    @RequestMapping("/queryHeiHttpclentt")
    @ResponseBody
    public void post() {
        // 创建默认的httpClient实例.
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 创建httppost
        HttpPost httppost = new HttpPost("http://localhost:8080/queryHeiHttpclent");
        // 创建参数队列
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        //往后台传参数
//        formparams.add(new BasicNameValuePair("page",String.valueOf(page)));
//        formparams.add(new BasicNameValuePair("rows",String.valueOf(rows)));
        UrlEncodedFormEntity uefEntity;
        try {
            uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httppost.setEntity(uefEntity);
            System.out.println("executing request " + httppost.getURI());
            //实际调用别的项目
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    System.out.println("--------------------------------------");
                    System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));
                    System.out.println("--------------------------------------");
                }
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
