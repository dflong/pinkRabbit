package com.dfl.pinkRabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
//@EnableAspectJAutoProxy
public class PurpleCatApplication {

    public static void main(String[] args) {
        SpringApplication.run(PurpleCatApplication.class, args);

//        SpringApplicationRunListener
    }

}
