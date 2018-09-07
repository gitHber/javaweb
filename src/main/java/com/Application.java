package com;

import com.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){
        // 1. 创建spring的ioc容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        // 2. 从ioc容器获取bean实例
        User user = (User)ctx.getBean("User");
        System.out.println(user.getName());
    }
}
