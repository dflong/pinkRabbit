package com.dfl.pinkRabbit.spring;

import com.dfl.pinkRabbit.spring.config.AppConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class IOC implements ApplicationContextAware, BeanFactoryPostProcessor {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        BeanFactory beanFactory;
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        A person = (A)ac.getBean("a");
//        person.say();
//        String id = person.applicationContext.getId();
//        System.out.println("id " + id);

//        BeautifulService silm = map.get("fat");
//        silm.face();


//        BeanDefinition definition; // 读取配置文件后定义bean
//        BeanDefinitionReader beanDefinitionReader; // 读取bean配置文件 xml,yaml,json
//        BeanPostProcessor beanPostProcessor; // bean-init方法前后执行 aop
//        DefaultListableBeanFactory defaultListableBeanFactory;
//        BeanFactoryPostProcessor beanFactoryPostProcessor;
//        DefaultSingletonBeanRegistry defaultSingletonBeanRegistry;
//        Object clazz = ac.getBean("a");
//        clazz.getClass().getDeclaredConstructor().newInstance();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        GoodsService bean = (GoodsService) applicationContext.getBean("goodsService");
        bean.say();
//        bean.insert();
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }

//    static Map<String, BeautifulService> map = new HashMap<>();

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        map.put("silm", (BeautifulService)applicationContext.getBean("slimBeautifulService"));
//        map.put("fat", (BeautifulService)applicationContext.getBean("fatBeautifulService"));

    }
}
