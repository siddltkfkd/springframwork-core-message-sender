package com.nhnacademy.edu.springframework.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework")
@PropertySource("classpath:user.properties")
public class JavaConfig {
}
