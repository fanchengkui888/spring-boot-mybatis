package com.jk.controller;

import com.jk.rabbitmq.hello.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/10 0010.
 */
@Controller
public class RabbitMQHellTest {

    @Autowired
    private HelloSender helloSender;//注入生产者

    @RequestMapping("/send")
    public void send(){
        for(int i=0;i<=1000;i++){
            helloSender.send();

        }


    }
}
