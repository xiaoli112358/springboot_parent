package com.tulingxueyuan.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tulingxueyuan.springboot.entity.User;
import com.tulingxueyuan.springboot.mapper.UserMapper;
import com.tulingxueyuan.springboot.service.UserService;
import com.tulingxueyuan.springboot.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.alibaba.druid.util.FnvHash.Constants.T;
import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    UserServiceImpl userService;


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

    @Test
    void query(){
        User user = userService.getById(41);
        System.out.println(user);
    }
    @Test
    /**
     * 在传入主键ID的时候，会自动按主键查询，有就更新，没有则插入
     */
    void saveOrUpdate(){
        User user = new User(1611763719,"小利",new Date().toString(),"男","鄂尔多斯");
        userService.saveOrUpdate(user);
        System.out.println(user);
    }

    /**
     * 批量删除
     */
    @Test
    void remove(){
        List<Integer>ids= Arrays.asList(1611763717,1611763719);
        userService.removeByIds(ids);
    }
    /**
     * 批量查询
     */
    @Test
    void listByIds(){
        List<Integer>ids= Arrays.asList(41,42);
        userService.listByIds(ids);
    }

    /**
     * 分页
     * 功能实现必须依赖启动类里面的MybatisPlusInterceptor的插件内容，否则sql根本不会有limit的内容
     */
    @Test
    void Page(){
        Page<User> userPage = new Page<>(1,2);
        Page<User> page = userService.page(userPage);
        System.out.println(page);
        System.out.println("页数："+page.getPages());
        System.out.println("总数："+page.getTotal());
    }

    /**
     * 基于xml分页功能
     */
    @Test
    void getPagebyXml(){
        Page<User> userPage = new Page<>(1,2);
        IPage<User> page = userMapper.getByGender(userPage, "男");
        System.out.println(page);
        System.out.println("页数："+page.getPages());
        System.out.println("总数："+page.getTotal());
    }

    /**
     * 构建复杂的查询
     */
    @Test
     void contextLoader(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("username","sex")//只查询这两个字段
                .eq("id","41"); //条件
        userService.list(queryWrapper);
    }
    @Test
    void between(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper
//                .isNull("username")
                .inSql("address","select '北京' from dual")
                .between("id",43,48)
                .groupBy("username","sex")
        ;
        System.out.println(userService.list(queryWrapper));
    }
    @Test
    void updateWrapper(){
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper
//                .set("username","胡二哈")
                .setSql("username = '胡二哈' ")
                .eq("id",41);
        userService.update(userUpdateWrapper);
    }
}
