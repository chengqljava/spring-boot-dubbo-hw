package com.hw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@SpringBootApplication
@EnableDubbo
@EnableTransactionManagement /*添加事条*/
@MapperScan("com.hw.mapper")
public class DubboProviderApplication {
	public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
