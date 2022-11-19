package com.tulingxueyuan.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * pom未引入druid-spring-boot-starter时使用该配置类，引入以后就可以去掉了
 * 该配置和druid-spring-boot-starter的作用就是初始化数据库执行sql,
 * 该配置类也是druid-spring-boot-starter的原理
 */
//@Configuration
//@ConditionalOnProperty("spring.datasource.type")
public class DruidConfiguration {
    @Bean
    //会绑定配置文件中所有spring.datasource开头的配置绑定到DataSource
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }

}
