package com.dfl.pinkRabbit.spring;

import com.dfl.pinkRabbit.spring.config.AppConfig;
import com.dfl.pinkRabbit.spring.xml.A;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class IOC implements ApplicationContextAware, BeanFactoryPostProcessor {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        AopTest aopTest1 = new AopTest();
//        aopTest1.setUsername("刘7");
//        AopTest aopTest2 = new AopTest();
//        aopTest2.setUsername("刘6");
//        // aopTest.getClass().getInterfaces()
//        AopTestIn o = (AopTestIn)Proxy.newProxyInstance(IOC.class.getClassLoader(), new Class[]{AopTestIn.class}, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                method.invoke(aopTest1, args);
//                return proxy;
//            }
//        });
//        o.setUsername("刘加利");
//        System.out.println(aopTest2.getUsername());

        //        BeanFactory beanFactory;
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
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
        bean.insert();
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
