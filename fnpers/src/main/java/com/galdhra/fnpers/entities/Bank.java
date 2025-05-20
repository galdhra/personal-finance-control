package com.galdhra.fnpers.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bank")
public class Bank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer place;
	
	@OneToMany(mappedBy = "bank1")
	private List<BankAccount> accounts = new ArrayList<>();
	
	@OneToMany(mappedBy = "bank2")
	private List<CreditCard> creditCards = new ArrayList<>();
	
	@OneToMany(mappedBy = "bank3")
	private List<Investiment> investiments = new ArrayList<>();
	
	
	public Bank() {}

	public Bank(Long id, Integer place) {
		this.id = id;
		this.place = place;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPlace() {
		return place;
	}

	public void setPlace(Integer place) {
		this.place = place;
	}
	

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public List<CreditCard> getCreditCards() {
		return creditCards;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(id, other.id);
	}
	

	
	
	

}
