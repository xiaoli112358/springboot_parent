package com.tulingxueyuan.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tulingxueyuan.springboot.entity.User;
import com.tulingxueyuan.springboot.mapper.UserMapper;
import com.tulingxueyuan.springboot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * service实现类需要继承mp提供的service基类
 *      ServiceImpl<UserMapper, User>
 *          2个泛型，1.UserMapper Mapper接口
 *                         2.User           对应POJO实体类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
