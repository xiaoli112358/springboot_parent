package com.tulingxueyuan;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.logging.Logger;

/**
 * 崇尚官方开发组的jul(实现)+jcl(门面)
 */
public class JulMain {
    public static void main(String[] args) {
//        Logger logger=Logger.getLogger(JulMain.class.getName());
        Log logger = LogFactory.getLog(JulMain.class.getName());
        System.out.println("适配器："+logger.getClass());
        logger.info("崇尚官方的logger");
    }
}
