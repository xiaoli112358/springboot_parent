package com.tulingxueyuan.springboot.component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.sun.xml.internal.ws.api.config.management.ManagedEndpointFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        //插入时：创建时间 修改时间
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("modifyTime",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("modifyTime",new Date(),metaObject);

    }
}
