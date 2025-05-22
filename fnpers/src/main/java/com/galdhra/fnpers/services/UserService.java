package com.galdhra.fnpers.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galdhra.fnpers.dto.UserDTO;
import com.galdhra.fnpers.entities.User;
import com.galdhra.fnpers.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public List<UserDTO> findAll() {
		List<User> result = userRepository.findAll();
		return result.stream().map(UserDTO::new).toList();
	}

}
