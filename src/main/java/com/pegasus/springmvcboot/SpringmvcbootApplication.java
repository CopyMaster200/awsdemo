package com.pegasus.springmvcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages = "com.pegasus.springmvcboot")
public class SpringmvcbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcbootApplication.class, args);
    }

}
