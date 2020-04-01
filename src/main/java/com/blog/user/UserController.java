
package com.blog.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */

@RestController
public class UserController {

    @Autowired
    IUserMapper iuser;


    @RequestMapping("/User")
    public User searchUser(/*@RequestParam int id*/){
        User u = iuser.getUserById();
        return u;
    }
    
}