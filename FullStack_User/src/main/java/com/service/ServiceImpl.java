package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.User;
import com.repo.UserRepo;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	@Autowired
	UserRepo repo;

	
	public List<User> Getallemp() {
		
		return repo.findAll();
	}

}
