package com.mongodemo.demo.mongoCURD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("getUser")
    public User getUser(@RequestParam(value = "str") String str){
        return userService.findUserByName(str);
    }

    @GetMapping("/name")
    public boolean saveUser(@RequestParam(value = "name")String name){
        User user = new User();
        user.setUserName(name);
        userService.save(user);
        return true;
    }
}
