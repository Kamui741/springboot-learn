package com.test.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
//@ComponentScan("com.test.service")
public class HelloWorldService {
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
//    public static void main(String[] args) {
//        SpringApplication.run(HelloWorldService.class, args);
//    }

}
