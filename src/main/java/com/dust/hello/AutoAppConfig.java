package com.dust.hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
@ComponentScan(     // excludeFilters: 기존 AppConfig 보존하기 위함.
        //basePackages = "com.dust.hello.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =
        Configuration.class)
)
public class AutoAppConfig {

}
