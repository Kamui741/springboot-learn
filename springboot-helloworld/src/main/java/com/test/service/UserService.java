package com.test.service;


import com.test.entity.UserEntity;
import com.test.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    @Autowired
//    private UserMapper userMapper;
//
//    @RequestMapping("/insertUserMybatis")
//    public String insertUserMybatis(String userName, Integer age){
//        int insert = userMapper.insertUser(userName, age);
//        return insert >0 ? "success" : "fail";
//    }
//    @RequestMapping("/mybatisfindbyid")
//    public UserEntity mybatisFindById(Integer id){
//        return userMapper.selectUserById(id);
//    }
    @RequestMapping("/myindex")
    public String index(){
        return "index";
    }
}
