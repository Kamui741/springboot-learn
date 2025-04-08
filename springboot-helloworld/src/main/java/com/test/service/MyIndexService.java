package com.test.service;

import com.test.entity.TestUserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyIndexService {
//    @Value("${test.name}")
//    private  String name;
//    @Value("${test.age}")
//    private  String age;
//    @Value("${test.address}")
//
//    @RequestMapping("/getNameAndAge")
//    public String getNameAndAge() {
//        return "name:"+name+"age:"+age;
//    }
    @Autowired
    private TestUserEntity testUserEntity;

    @RequestMapping("/getNameAndAddress")
    public String getTestUserEntity() {
        log.info("testUserEntity:{}",testUserEntity.toString());
        return testUserEntity.toString();
    }
}
