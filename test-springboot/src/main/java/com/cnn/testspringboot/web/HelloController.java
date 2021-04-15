/**
 * Copyright(c) 2011-2020 by YouCredit Inc. All Rights Reserved
 */
package com.cnn.testspringboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2020/11/22
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}
