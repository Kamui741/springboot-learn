package com.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/insertuser")
    public String insertUser(String userName, Integer age) {
        int update = jdbcTemplate.update("insert into users values (null, ?, ?)", userName, age);
        return update > 0 ? "success" : "fail";
    }
}
