package com.galdhra.fnpers.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.galdhra.fnpers.enums.PayMethod;
import com.galdhra.fnpers.enums.TypeCycle;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_expense")
public class Expense {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private Date date;
	
	@Column(columnDefinition = "TEXT")
	private String description;
	private Double amount;
	private PayMethod payMethod;
	private Boolean recurring;
	private Boolean stallment;
	private Boolean payed;
	private TypeCycle type;
	
	@Column(columnDefinition = "TEXT")
	private String observation;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	@ManyToMany
	@JoinTable(name = "tb_budget_expense",
	joinColumns = @JoinColumn(name = "expense_id"),
	inverseJoinColumns = @JoinColumn(name = "budget_id"))
	private Set<Budget> expenseBudgets = new HashSet<>();
	
	@OneToOne(mappedBy = "expense", cascade = CascadeType.ALL)
	private Debt debt;
	
	
	public Expense() {};


	public Expense(Long id, String name, Date date, String description, Double amount, PayMethod payMethod, Boolean recurring, Boolean stallment,
			Boolean payed, TypeCycle type, String observation) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.payMethod = payMethod;
		this.recurring = recurring;
		this.stallment = stallment;
		this.payed = payed;
		this.type = type;
		this.observation = observation;
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


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public PayMethod getPayMethod() {
		return payMethod;
	}


	public void setPayMethod(PayMethod payMethod) {
		this.payMethod = payMethod;
	}


	public Boolean getRecurring() {
		return recurring;
	}


	public void setRecurring(Boolean recurring) {
		this.recurring = recurring;
	}


	public Boolean getStallment() {
		return stallment;
	}


	public void setStallment(Boolean stallment) {
		this.stallment = stallment;
	}


	public Boolean getPayed() {
		return payed;
	}


	public void setPayed(Boolean payed) {
		this.payed = payed;
	}


	public String getObservation() {
		return observation;
	}


	public void setObservation(String observation) {
		this.observation = observation;
	}


	public TypeCycle getType() {
		return type;
	}


	public void setType(TypeCycle type) {
		this.type = type;
	}
	

	public Category getCategory() {
		return category;
	}


	public Account getAccount() {
		return account;
	}


	public Set<Budget> getExpenseBudgets() {
		return expenseBudgets;
	}


	public Debt getDebt() {
		return debt;
	}


	@Override
	public int hashCode() {
		return Objects.hash(amount, date, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expense other = (Expense) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(date, other.date) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	};
	
	
	
	
}
