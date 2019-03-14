package com.hw;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@EnableDubbo
/*@EnableTransactionManagement 添加事条*/
public class DubboProviderApplication {
	public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
