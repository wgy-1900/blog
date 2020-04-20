package org.lang.securitydy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Lang wgyhon@gmail.com
 * @CreateDate: 2020/4/19 23:07
 * @Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello lang";
    }
    @GetMapping("/hello1")
    public String hello1(){
        return "hello lang1";
    }
}
