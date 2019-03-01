package com.dchb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.dchb.redis.RedisUtil"}, exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {
        "com.dchb.config",
        "com.dchb.mapper",
        "com.dchb.web",
        "com.dchb.redis",
        "com.dchb.service",
        "com.dchb.annotation",
        "com.dchb.util",
        "com.dchb.aop"})
public class Application {

    protected final static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        System.setProperty("tomcat.util.http.parser.HttpParser.requestTargetAllow", "|{}");
    }

}
