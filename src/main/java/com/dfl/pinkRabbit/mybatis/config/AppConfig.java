package com.dfl.pinkRabbit.mybatis.config;


import com.dfl.pinkRabbit.mybatis.context.DflongScanner;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@ComponentScan("com.apollo.purplecat.mybatis")
@DflongScanner("com.apollo.purplecat.mybatis.mapper")
public class AppConfig {

    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/school_mall");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }
}
