package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDubbo
public class SbWebApplication {
	public static void main(String[] args) {
        SpringApplication.run(SbWebApplication.class, args);
    }
}
