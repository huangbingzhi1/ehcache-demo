package com.hisense.ehcachedemo.service;

import com.hisense.ehcachedemo.entity.User;

import java.util.List;

/**
 * @Author Huang.bingzhi
 * @Date 2019/6/29 11:22
 * @Version 1.0
 */
public interface UserService {
     List<User> getUserList(String id);
     void insertUser();
}
