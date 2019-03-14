package com.hw.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hw.service.DemoService;

@RestController
public class RemoteDemoController {
	@Reference(version = "${demo.service.version}")
	private DemoService demoService;
	
	@RequestMapping(value="/dubbo/say/{name}")
    public String sayHello(@PathVariable("name") String name){

		String result=demoService.say(name);
        return result;
    }

	
}
