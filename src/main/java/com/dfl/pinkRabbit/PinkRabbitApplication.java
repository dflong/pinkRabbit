package com.dfl.pinkRabbit;

import com.dfl.pinkRabbit.mybatis.context.DflongScanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
//@EnableAspectJAutoProxy
public class PinkRabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinkRabbitApplication.class, args);

//        SpringApplicationRunListener
    }

}
