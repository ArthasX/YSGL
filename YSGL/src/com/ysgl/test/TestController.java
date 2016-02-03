package com.ysgl.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ysgl.pojo.User;
import com.ysgl.service.IUserService;;
@Controller
@RequestMapping("/user")
public class TestController {
	@Resource
	private IUserService userService;
	@RequestMapping("/showUser")
	public String show(){
		User user;
		try {
			user = userService.getUserById(1);
			System.out.println(user.getUserId());
			return "hello world  "+user.getUserId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getClass().getName();
		}
		
		
	}
	
 
}
