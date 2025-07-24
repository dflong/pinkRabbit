package com.dfl.pinkRabbit.spring;


import org.springframework.beans.factory.SmartInitializingSingleton;

public class Man implements SmartInitializingSingleton {

    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("Man after singleton instantiated");
    }
}
