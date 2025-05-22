package com.galdhra.fnpers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galdhra.fnpers.dto.UserDTO;
import com.galdhra.fnpers.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping
	public List<UserDTO> findAll() {
		List<UserDTO> result = userService.findAll();
		return result;
	}
}
