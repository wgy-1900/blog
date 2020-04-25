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
    @GetMapping("/db/hello")
    public String db(){
        return "hello db";
    }
    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin";
    }
    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }
}
