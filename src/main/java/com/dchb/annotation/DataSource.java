package com.dchb.annotation;

import com.dchb.enums.DataSourceEnum;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    DataSourceEnum value() default DataSourceEnum.SQLSERVER;
}
