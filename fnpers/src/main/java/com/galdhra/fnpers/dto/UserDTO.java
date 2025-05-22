package com.galdhra.fnpers.dto;

import java.time.Instant;
import java.util.Date;

import org.springframework.beans.BeanUtils;

import com.galdhra.fnpers.entities.User;

public class UserDTO {
	
	private Long id;
	private String name;	
	private String email;
	private Date birthDate;
	private String profession;
	private Instant profileCreationDate;
	
	private UserDTO() {}	
	
		
	public UserDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
		birthDate = entity.getBirthDate();
		profession = entity.getProfession();
		profileCreationDate = entity.getProfileCreationDate();	
		
		}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Instant getProfileCreationDate() {
		return profileCreationDate;
	}

	public void setProfileCreationDate(Instant profileCreationDate) {
		this.profileCreationDate = profileCreationDate;
	}
	
	

}
