package com.galdhra.fnpers.entities;

import java.util.Objects;

import com.galdhra.fnpers.enums.typeAccount;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bank_account")
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private Integer number;
	private typeAccount type;
	
	@ManyToOne
	@JoinColumn(name="bank1_id")
	private Bank bank1;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	
	
	public BankAccount() {}

	public BankAccount(Long id, String name, Integer number, typeAccount type, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.type = type;
		this.bank1 = bank;
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public typeAccount getType() {
		return type;
	}

	public void setType(typeAccount type) {
		this.type = type;
	}

	public Bank getBank1() {
		return bank1;
	}

	public void setBank1(Bank bank1) {
		this.bank1 = bank1;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Bank getBank() {
		return bank1;
	}


	@Override
	public int hashCode() {
		return Objects.hash(bank1, id, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(bank1, other.bank1) && Objects.equals(id, other.id) && Objects.equals(number, other.number);
	};
	
	

}
