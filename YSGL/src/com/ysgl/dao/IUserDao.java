package com.ysgl.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ysgl.pojo.User;

@Repository
@Transactional
public interface IUserDao {
	
	public void insertUser(User user);

	public void updateUser(User user);

	public void deleteUser(int userId);
	
	public User findById(int userId);
}
