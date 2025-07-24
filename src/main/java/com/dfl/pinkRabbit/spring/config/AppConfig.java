package com.dfl.pinkRabbit.spring.config;

import com.dfl.pinkRabbit.spring.Man;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

//@Component
//@Configuration // 为了配合@bean
@ComponentScan("com.dfl.pinkRabbit.spring")
@ComponentScans({
        @ComponentScan(basePackages = {"com.dfl.pinkRabbit.leetcode"}),
})
@ImportResource("classpath:applicationContext.xml") // 通过注解方式
@Import(Man.class)
public class AppConfig {

//    @Bean
//    public JdbcTemplate jdbcTemplate() {
//        return new JdbcTemplate(dataSource());
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//        transactionManager.setDataSource(dataSource());
//        return transactionManager;
//    }

//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/school_mall");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123456");
//        return dataSource;
//    }

}
