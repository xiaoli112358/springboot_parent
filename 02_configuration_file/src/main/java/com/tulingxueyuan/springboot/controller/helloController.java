package com.tulingxueyuan.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
    @RequestMapping("/file")
    public String sayHi(){
        return "hello Springboot";
    }
}
