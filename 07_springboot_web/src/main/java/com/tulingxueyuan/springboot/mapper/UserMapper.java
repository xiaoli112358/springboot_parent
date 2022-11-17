package com.tulingxueyuan.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tulingxueyuan.springboot.entity.User;

public interface UserMapper extends BaseMapper<User> {
    /**
     * 只需要传参的时候传入IPage，就可以实现分页的功能
     * 前提也得依赖启动类里面的分页插件
     * @param page
     * @param sex
     * @return
     */
    IPage<User> getByGender(IPage page, String sex);
}
