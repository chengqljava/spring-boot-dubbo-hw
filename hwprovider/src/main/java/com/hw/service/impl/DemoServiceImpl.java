package com.hw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.hw.service.DemoService;
import com.hw.service.UserService;

@Component
@Service(version="${demo.service.version}",timeout = 10000,interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {
	@Autowired
	private UserService userService;

	@Override
	public String say(String hello) {
		// TODO Auto-generated method stub
		System.out.println("provider"+hello);
		userService.testMapper();
		userService.readMapper();
		return "hello+world";
	}

}
