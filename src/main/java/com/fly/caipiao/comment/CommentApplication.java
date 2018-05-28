package com.fly.caipiao.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, JdbcTemplateAutoConfiguration.class})
//@EnableAutoConfiguration
public class CommentApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CommentApplication.class, args);
    }
}
