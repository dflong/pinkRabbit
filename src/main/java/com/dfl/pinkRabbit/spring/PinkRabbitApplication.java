package com.dfl.pinkRabbit.spring;

import com.dfl.pinkRabbit.spring.config.MyImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
@Import(MyImportSelector.class)
//@EnableAspectJAutoProxy
public class PinkRabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinkRabbitApplication.class, args);

//        SpringApplicationRunListener
    }

}
