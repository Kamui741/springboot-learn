package com.test.service;


import com.test.async.MemberServiceAsync;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MemberService {

//    @Value("${test.name}")
//    private String name;
//    @Value("${test.age}")
//    private String age;
//    @RequestMapping("/member")
//    public String getMember(){
//        return "Member";
//    }
//    @RequestMapping("/properties")
//    public String getProperties(){
//        return "Name : " + name + " Age : " + age;
//    }
    @Autowired
    private MemberServiceAsync memberServiceAsync;
    @RequestMapping("/addMember")
    public  String addMember(){
        log.info(">01<");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                sms();
//            }
//        }).start();
        memberServiceAsync.sms();
        log.info(">04<");
        return "addMember";
    }

}


