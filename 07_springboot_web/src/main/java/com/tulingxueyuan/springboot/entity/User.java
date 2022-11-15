package com.tulingxueyuan.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

//mybatisPlus会默认将实体类名当作表名，如果跟数据库不一致使用该注解
@TableName("sys_user")
public class User {
    @TableId(value = "id",type = IdType.AUTO) //数据库有主键自增，该注解用来让它自增，否则mybatisPlus会自己生成一个id值
    private Integer id;
//    当实体类字段名和数据库字段名不一致时使用
    @TableField("username")
    private String user_name;
    private String birthday;
    private String sex;
    private String address;

    public User(Integer id, String user_name, String birthday, String sex, String address) {
        this.id = id;
        this.user_name = user_name;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return user_name;
    }

    public void setUsername(String username) {
        this.user_name = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + user_name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
