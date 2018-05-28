package com.fly.caipiao.comment.framework.page;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  分页
 *
 * @author baidu
 */
@Configuration
public class PageHelperConfig {
        @Bean
        public PageHelper pageHelper() {
            PageHelper pageHelper = new PageHelper();
//            Properties properties = new Properties();
//            properties.setProperty("offsetAsPageNum", "true");
//            properties.setProperty("rowBoundsWithCount", "true");
//            properties.setProperty("reasonable", "true");
//            pageHelper.setProperties(properties);
            return pageHelper;  
        }  
}