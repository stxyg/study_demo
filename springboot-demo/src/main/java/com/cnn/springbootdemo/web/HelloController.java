/**
 * Copyright(c) 2011-2020 by YouCredit Inc.
 * All Rights Reserved
 */
package com.cnn.springbootdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnn.springbootdemo.service.HelloService;

/**
 * @author Administrator
 * @date 2020/4/1
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;
    @GetMapping("/")
    public void test(){
        this.helloService.test();
    }
}
