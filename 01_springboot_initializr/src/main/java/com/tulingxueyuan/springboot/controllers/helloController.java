package com.tulingxueyuan.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
    @RequestMapping("/ini")
    public String sayHi(){
        return "hello Springboot 嘿嘿嘿";
    }
}
