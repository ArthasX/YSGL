package com.ysgl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ysgl.dao.IUserDao;
import com.ysgl.pojo.User;
import com.ysgl.service.IUserService;


@Service("userService") 
public class UserService implements IUserService {
	@Resource
	private IUserDao userDao;
	
	@Override
	public User getUserById(int userId) {
		return userDao.findById(userId);
	}
	
}
