package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.AdminDAO;

@Service
public class AdminService {
	
	@Autowired
	private AdminDAO admindao;
	
	

}
