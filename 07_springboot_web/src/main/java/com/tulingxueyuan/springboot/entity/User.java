package com.tulingxueyuan.springboot.entity;

import com.baomidou.mybatisplus.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;

//mybatisPlus会默认将实体类名当作表名，如果跟数据库不一致使用该注解
@TableName("sys_user")
public class User {
//    @TableId(value = "id",type = IdType.AUTO) //数据库有主键自增，该注解用来让它自增，否则mybatisPlus会自己生成一个id值
    private Integer id;
//    当实体类字段名和数据库字段名不一致时使用
    @TableField("username")
    private String user_name;
    private String birthday;
    private String sex;
    private String address;

//    @TableLogic//实现逻辑删除的注解
    //想实现指定的 原来是多少，逻辑删除以后是多少的话添加参数
//    @TableLogic(value = "1",delval = "0")
    private Integer enabled;

//    创建时间：希望在添加数据的时候实现填充
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
//    更新时间：希望在添加、更新数据的时候实现填充
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifyTime;

    @Version
    private Integer version;

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public User() {
    }

    public User(Integer id, String user_name, String birthday, String sex, String address) {
        this.id = id;
        this.user_name = user_name;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
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
