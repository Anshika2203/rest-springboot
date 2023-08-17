package com.test.restspringboot.model;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("users")
public class User {
    @Id
    private String UserId;
    private String UserName;
    private String UserPhoneNumber;

    public User() {
    }

    public User(String userId, String userName, String userPhoneNumber) {
        UserId = userId;
        UserName = userName;
        UserPhoneNumber = userPhoneNumber;
    }

//    Getters and setters

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        UserPhoneNumber = userPhoneNumber;
    }


}
