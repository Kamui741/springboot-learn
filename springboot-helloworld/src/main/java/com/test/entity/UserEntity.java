package com.test.entity;

public class UserEntity {
    private  String userName;
    private  Integer age;
    private  Integer id;

    public UserEntity(Integer id,String userName,Integer age) {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }
    public UserEntity(String userName,Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() { return  userName; }
    public Integer getAge() { return age; }
    public void  setUserName(String userName) { this.userName = userName; }
    public void setAge(Integer age) { this.age = age; }
}
