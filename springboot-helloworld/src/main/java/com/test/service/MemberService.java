package com.test.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {

    @Value("${test.name}")
    private String name;
    @Value("${test.age}")
    private String age;
    @RequestMapping("/member")
    public String getMember(){
        return "Member";
    }
    @RequestMapping("/properties")
    public String getProperties(){
        return "Name : " + name + " Age : " + age;
    }
}
