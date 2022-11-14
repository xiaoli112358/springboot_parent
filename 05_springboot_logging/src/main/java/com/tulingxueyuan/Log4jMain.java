package com.tulingxueyuan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 崇尚开源的Log4j(实现)+slf4j(门面) 必须加上桥接器
 */
public class Log4jMain {
    public static void main(String[] args) {
//       Logger logger= Logger.getLogger(Log4jMain.class);
        Logger logger = LoggerFactory.getLogger(Log4jMain.class);
        System.out.println("桥接器："+logger.getClass());
        logger.info("崇尚开源的logger");
    }
}
