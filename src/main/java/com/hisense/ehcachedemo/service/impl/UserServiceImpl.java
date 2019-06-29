package com.hisense.ehcachedemo.service.impl;


import com.hisense.ehcachedemo.entity.User;
import com.hisense.ehcachedemo.service.UserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Huang.bingzhi
 * @Date 2019/6/29 11:24
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Cacheable(value = "users")
    @Override
    public List<User> getUserList(String id) {
        List<User> users=new ArrayList<>(5);
        users.add(new User("LBJ","詹姆斯"));
        users.add(new User("A D","戴维斯"));
        System.out.println("sss");
        return users;
    }
    @Override
    @CacheEvict(value = "users",allEntries = true)
    public void insertUser(){
        System.out.println("invalid");
    }
}
