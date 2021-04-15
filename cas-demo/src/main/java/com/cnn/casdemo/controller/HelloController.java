/**
 * Copyright(c) 2011-2020 by YouCredit Inc.
 * All Rights Reserved
 */
package com.cnn.casdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2020/7/16
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String test1(){
        return "test1....";
    }
}
