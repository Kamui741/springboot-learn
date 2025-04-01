package com.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

@Controller
public class FreemarkerIndexController {
    @RequestMapping("/index")
    public String freemarkerIndex(Map<String, Object> result, HttpServletRequest request){
        System.out.println("Controller method invoked!"); // 确认是否打印
        result.put("name","test1111");
        result.put("sex","0");
        result.put("age",18);
        ArrayList<String> userlist = new ArrayList<>();
        userlist.add("user1");
        userlist.add("user2");
        result.put("userlist",userlist);
        return "freemarkerIndex";




    }
}
