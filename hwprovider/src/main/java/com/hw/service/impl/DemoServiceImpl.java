package com.hw.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.hw.service.DemoService;

@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {

	@Override
	public String say(String hello) {
		// TODO Auto-generated method stub
		System.out.println("provider"+hello);
		return "hello+world";
	}

}
