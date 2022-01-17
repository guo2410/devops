package com.wtl.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoch0613@163.com
 * @Description
 * @create 2022-01-17 14:29
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello java jenkins";
    }
}
