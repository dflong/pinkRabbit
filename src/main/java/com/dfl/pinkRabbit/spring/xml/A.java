package com.dfl.pinkRabbit.spring.xml;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class A implements ApplicationContextAware {

//    private B b;
//
//    public B getB() {
//        return b;
//    }
//
//    public void setB(B b) {
//        this.b = b;
//    }

    public void say() {
        System.out.println("A Hello World");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("bean count is " + applicationContext.getBeanDefinitionCount());
    }
}
