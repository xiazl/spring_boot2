package com.fly.caipiao.comment.configuration.datasource;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    DataSourceType value() default DataSourceType.read;
}
