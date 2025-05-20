package com.galdhra.fnpers.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private String email;
	
	@Column(name = "birth_date")
	private Date birthDate;
	private String profession;
	
	@Column(name = "profile_creation_date", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant profileCreationDate;
	

	@OneToMany(mappedBy = "user")
	private List<Account> accounts = new ArrayList<>();
	
	
	public User() {}

	public User(Long id, String name, String email, Date birthDate, String profession,Instant profileCreationDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;		
		this.profession = profession;
		this.profileCreationDate = profileCreationDate;
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
	
	

	public List<Account> getAccounts() {
		return accounts;
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
