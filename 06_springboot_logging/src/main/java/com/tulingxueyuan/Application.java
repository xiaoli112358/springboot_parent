package com.tulingxueyuan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    //    声明日志记录器
   static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        logger.trace("追踪");
        logger.debug("调试");
        logger.info("信息");
        logger.warn("警告");
        logger.error("异常");
    }

}
