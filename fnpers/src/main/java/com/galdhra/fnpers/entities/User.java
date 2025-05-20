package com.galdhra.fnpers.entities;

import java.util.Date;
import java.util.Objects;

public class User {
	
	
	private Long id;
	private String name;
	private String email;
	private Date birthDate;
	private String profession;
	
	public User() {}

	public User(Long id, String name, String email, Date birthDate, String profession) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.profession = profession;
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

	@Override
	public int hashCode() {
		return Objects.hash(email, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id);
	};
	
	
	
	

}
