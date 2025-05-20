package com.galdhra.fnpers.entities;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private Boolean recurring;
	private Boolean stallment;
	private Boolean payed;
	
	@Column(columnDefinition = "TEXT")
	private String observation;
	
	
	public Expense() {};


	public Expense(Long id, String name, Date date, String description, Double amount, Boolean recurring, Boolean stallment,
			Boolean payed, String observation) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.recurring = recurring;
		this.stallment = stallment;
		this.payed = payed;
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
