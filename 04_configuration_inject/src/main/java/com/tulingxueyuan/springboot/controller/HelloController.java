package com.tulingxueyuan.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    public String sayHi(){
        return "hello Springboot 嘿嘿嘿";
    }

}
