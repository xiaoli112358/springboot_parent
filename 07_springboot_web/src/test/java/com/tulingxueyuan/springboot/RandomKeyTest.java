package com.tulingxueyuan.springboot;

import com.baomidou.mybatisplus.core.toolkit.AES;
import org.junit.jupiter.api.Test;

public class RandomKeyTest {
    /**
     * 对数据库路径 用户名 密码进行加密，防止程序员删库跑路
     */
    @Test
    void random(){
        // 生成 16 位随机 AES 密钥
//        String randomKey = AES.generateRandomKey();
//        System.out.println(randomKey);
        // 随机密钥加密 分别对url username password进行加密
//        String result = AES.encrypt("data", randomKey);
        String url = AES.encrypt("jdbc:p6spy:mysql://localhost:3306/maven?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=Asia/Shanghai", "735e3688e3c81179");
        String username = AES.encrypt("root", "735e3688e3c81179");
        String passwpord = AES.encrypt("root", "735e3688e3c81179");
        System.out.println(url);
        System.out.println(username);
        System.out.println(passwpord);

//        String decrypt = AES.decrypt("lnlRgHk9yOkKhPWpcx3ZtaU0JBCqZKPBGAZhgnEL240CJMm6r2jLzW5mxa2a1oaO0hPrbURFZRfLNDI95/iILxdlHc69E0uOJPcvJRQZeKHU50EmhGMjg/mHxsf+QhTglAPNnGHbS5ogixqjcBR7AU+xdgid6SK6zxxjAz3obB8=", "735e3688e3c81179");
//        System.out.println(decrypt);
    }
}
