package com.tulingxueyuan.springboot;

import com.tulingxueyuan.springboot.entity.User;
import com.tulingxueyuan.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.selectById(41);
        System.out.println(user);
    }

    @Test
    void insert(){
        User user = new User(null,"小利",new Date().toString(),"男","鄂尔多斯");
        userMapper.insert(user);
//        插入完成后可以立即得到插入的值
        System.out.println(user);
    }
    @Test
    void del(){
        userMapper.deleteById(-1634717695);
    }
    @Test
    void update(){
        User user = new User(1611763717, "大力", new Date().toString(), "女", "东胜区");
        userMapper.updateById(user);

        System.out.println(user);
    }
}
