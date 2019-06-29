package com.hisense.ehcachedemo.controller;

import com.hisense.ehcachedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Huang.bingzhi
 * @Date 2019/6/29 11:21
 * @Version 1.0
 */
@RestController
@RequestMapping("userController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUserList", method = RequestMethod.GET)
    public Object getUserList(@RequestParam String id){
        return userService.getUserList(id);
    }
    @RequestMapping(value = "insert", method = RequestMethod.GET)
    public void insert(){
        userService.insertUser();
    }
}
