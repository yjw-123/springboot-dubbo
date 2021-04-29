package com.dubbo.starter.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.starter.pojo.User;
import com.dubbo.starter.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User saveUser(User user) {
		user.setId(1);
        System.out.println(user.toString());
		return user;
	}

}
