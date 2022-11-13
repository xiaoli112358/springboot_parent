package com.tulingxueyuan.springboot.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "user")//该注解可以省略下面写很多的@Value属性,并且在配置文件中username不同的命名规则都可以
@Validated //校验为空字段的，但是使用该注解pom需要引用一个依赖spring-boot-starter-validation
@PropertySource("classpath:data/user.properties") //该注解用来读取单独拿出来的user属性，并且不支持yml文件
public class User {
//    @Value("${user.username}")
    @NotNull //注意包别引用成其他的
    private String username;
//    @Value("${user.age}")
    private Integer age;
    private Date birthday;
    private List<String> hobbies;
    private Map<Integer,String>girlFriend;
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<Integer, String> getGirlFriend() {
        return girlFriend;
    }

    public void setGirlFriend(Map<Integer, String> girlFriend) {
        this.girlFriend = girlFriend;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobbies=" + hobbies +
                ", girlFriend=" + girlFriend +
                ", address=" + address +
                '}';
    }
}
