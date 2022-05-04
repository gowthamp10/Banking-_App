package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repository.UserDAO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userdao;
	
	public String loginValid() {
		return null;
	}
	
	public String addUsers(User user) {
		
		userdao.save(user);
		return "user added";
		
	}
	 
	

}
