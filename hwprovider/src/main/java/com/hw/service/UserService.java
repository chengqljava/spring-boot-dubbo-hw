package com.hw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.entity.User;
import com.hw.mapper.UserMapper;


@Service
public class UserService {
	@Autowired
	UserMapper userMapper;

	@Transactional(rollbackFor = Exception.class)//事务管理
	public int testMapper() {
		User user = new User();
		user.setId(3);
		user.setAge(987);
		user.setName("555");
		int k = userMapper.insert(user);
		return k;
	}
	
	public void readMapper() {
		User user = userMapper.selectByPrimaryKey(1);
		List<User> list=userMapper.selectByExample();
		System.out.println("readMapper"+user.getName());
	}
}
