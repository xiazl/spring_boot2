package com.fly.caipiao.comment.configuration.jdbc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 配置JdbcTemplate
 *
 */
@Configuration
public class JdbcTemplateAutoConfiguration {

    @Bean
    public JdbcTemplate jdbcTemplate(@Qualifier("routingDataSource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

}
