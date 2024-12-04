package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.service.Service;

@CrossOrigin("*")
@RestController
public class Controller {

	@Autowired
	Service service;

	@GetMapping("/getallEmp")
	public List<User> Getallemp() {

		return service.Getallemp();
	}

}
