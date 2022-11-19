package com.tulingxueyuan.springboot.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tulingxueyuan.springboot.mapper")

public class MybatisPlusConfig {

    /**
     * 该方法其实就是一个拦截器，做分页的拦截
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mpi = new MybatisPlusInterceptor();
        //添加分页拦截器
        mpi.addInnerInterceptor(new PaginationInnerInterceptor());
        //添加乐观锁拦截器
        mpi.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return mpi;
    }
}
