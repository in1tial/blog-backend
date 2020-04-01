package com.blog.user;

import java.sql.Date;

/**
 * User
 */
public class User {

    private Integer userId;
    private String userName;
    private Date birthday;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User [birthday=" + birthday + ", userId=" + userId + ", userName=" + userName + "]";
    }

    

    
    

}