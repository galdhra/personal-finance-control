package com.galdhra.fnpers.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_budget")
public class Budget {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private Double plannedPay;
	private Double realPay;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@OneToMany(mappedBy = "budget")
	private List<Goal> goals = new ArrayList<>();
	

	@ManyToMany(mappedBy = "incomeBudgets")
	private Set<Income> incomes = new HashSet<>();
	
	@ManyToMany(mappedBy = "expenseBudgets")
	private Set<Expense> expenses = new HashSet<>();
	
	@ManyToMany(mappedBy = "debtBudgets")
	private Set<Debt> debts = new HashSet<>();
	
	
	public Budget() {}

	public Budget(Long id, String name, Double plannedPay, Double realPay, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.plannedPay = plannedPay;
		this.realPay = realPay;
		this.category = category;
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

	public Double getPlannedPay() {
		return plannedPay;
	}

	public void setPlannedPay(Double plannedPay) {
		this.plannedPay = plannedPay;
	}

	public Double getRealPay() {
		return realPay;
	}

	public void setRealPay(Double realPay) {
		this.realPay = realPay;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Budget other = (Budget) obj;
		return Objects.equals(category, other.category) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	};
	
	

	

}
