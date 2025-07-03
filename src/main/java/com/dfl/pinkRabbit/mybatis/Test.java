package com.dfl.pinkRabbit.mybatis;

import com.dfl.pinkRabbit.mybatis.config.AppConfig;
import com.dfl.pinkRabbit.mybatis.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test implements ApplicationContextAware {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        UserService bean = context.getBean("userService", UserService.class);
        bean.say();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("   ");
        System.out.println(applicationContext.getApplicationName());
    }
}
