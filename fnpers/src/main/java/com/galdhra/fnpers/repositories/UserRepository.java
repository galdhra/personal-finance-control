package com.galdhra.fnpers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.galdhra.fnpers.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
