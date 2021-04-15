/**
 * Copyright(c) 2011-2020 by YouCredit Inc.
 * All Rights Reserved
 */
package com.cnn.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnn.springbootdemo.dao.TestMapper;

/**
 * @author Administrator
 * @date 2020/4/1
 */
@Service
public class HelloService {
    @Autowired
    private TestMapper testMapper;
    public void test(){
        System.out.println(this.testMapper.selectById(1));
    }
}
