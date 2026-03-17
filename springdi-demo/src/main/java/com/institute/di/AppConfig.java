package com.institute.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.institute.di")
public class AppConfig {

    @Bean
    public Student student() {
        return new Student(102, "Ali", "Cyber Security", 3);
    }
}
