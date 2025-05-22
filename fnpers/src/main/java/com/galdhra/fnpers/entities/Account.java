package com.galdhra.fnpers.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy = "account")
	private List<Income> incomes = new ArrayList<>();
	
	@OneToMany(mappedBy = "account")
	private List<Expense> expenses = new ArrayList<>();
	
	@OneToMany(mappedBy = "account")
	private List<Investment> investments = new ArrayList<>();
	
	@OneToMany(mappedBy = "account")
	private List<BankAccount> bankAccounts = new ArrayList<>();
	
	@OneToMany(mappedBy = "account")
	private List<Goal> goals = new ArrayList<>();
	
	@OneToMany(mappedBy = "account")
	private List<CreditCard> carditCards = new ArrayList<>();
	
	@OneToMany(mappedBy = "account")
	private List<Debt> debts = new ArrayList<>();
	
	@OneToMany(mappedBy = "account")
	private List<Budget> bugdets = new ArrayList<>();
	

	
	public Account() {};
	
	
	
}
