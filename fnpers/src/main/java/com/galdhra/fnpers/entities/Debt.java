package com.galdhra.fnpers.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.galdhra.fnpers.enums.TypeCycle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_debt")
public class Debt {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private Double amount;
	private Double interest;
	private Double origin;
	private Date dueDate;
	private Boolean stallment;
	private Boolean payed;
	private TypeCycle type;
	
	@OneToOne
	@MapsId
	private Expense expense;
	
	@ManyToMany
	@JoinTable(name = "tb_budget_debt",
	joinColumns = @JoinColumn(name = "debt_id"),
	inverseJoinColumns = @JoinColumn(name = "budget_id"))
	private Set<Budget> debtBudgets = new HashSet<>();
	
	@ManyToMany(mappedBy = "debtCreditCards")
	private Set<CreditCard> creditCards = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
		
	
	private Debt() {}


	public Debt(Long id, String name, Double amount, Double interest, Double origin, Date dueDate, Boolean stallment,
			Boolean payed, TypeCycle type) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.interest = interest;
		this.origin = origin;
		this.dueDate = dueDate;
		this.stallment = stallment;
		this.payed = payed;
		this.type = type;
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


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public Double getInterest() {
		return interest;
	}


	public void setInterest(Double interest) {
		this.interest = interest;
	}


	public Double getOrigin() {
		return origin;
	}


	public void setOrigin(Double origin) {
		this.origin = origin;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
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

	public TypeCycle getType() {
		return type;
	}


	public void setType(TypeCycle type) {
		this.type = type;
	}


	@Override
	public int hashCode() {
		return Objects.hash(amount, id, origin);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Debt other = (Debt) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(id, other.id)
				&& Objects.equals(origin, other.origin);
	};
	
	
	

}
