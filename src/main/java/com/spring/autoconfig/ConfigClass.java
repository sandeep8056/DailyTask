package com.spring.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.autoconfig")
@PropertySource("classpath:com/spring/autoconfig/college-info.properties")
public class ConfigClass {

}
