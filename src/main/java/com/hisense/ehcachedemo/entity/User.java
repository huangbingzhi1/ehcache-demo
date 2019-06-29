package com.hisense.ehcachedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author Huang.bingzhi
 * @Date 2019/6/29 11:22
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class User  implements Serializable {
    private String id;
    private String name;
}
