package com.example.lottery.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.lottery")
@PropertySource("classpath:lottery-test.properties")
@Profile("test")
public class AppTestConfig {

}
