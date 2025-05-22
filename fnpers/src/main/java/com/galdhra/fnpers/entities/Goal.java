package com.galdhra.fnpers.entities;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_goal")
public class Goal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private Double target;
	private Double nowAmount;
	private Date due;
	
	@Column(columnDefinition = "TEXT")
	private String observation;
	
	@ManyToOne
	@JoinColumn(name="budget_id")
	private Budget goalBudget;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	
	
	public Goal() {}



	public Goal(Long id, String name, Double target, Double nowAmount, Date due, String observation) {
		super();
		this.id = id;
		this.name = name;
		this.target = target;
		this.nowAmount = nowAmount;
		this.due = due;
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



	public Double getTarget() {
		return target;
	}



	public void setTarget(Double target) {
		this.target = target;
	}



	public Double getNowAmount() {
		return nowAmount;
	}



	public void setNowAmount(Double nowAmount) {
		this.nowAmount = nowAmount;
	}



	public Date getDue() {
		return due;
	}



	public void setDue(Date due) {
		this.due = due;
	}



	public String getObservation() {
		return observation;
	}



	public void setObservation(String observation) {
		this.observation = observation;
	}



	@Override
	public int hashCode() {
		return Objects.hash(due, id, target);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goal other = (Goal) obj;
		return Objects.equals(due, other.due) && Objects.equals(id, other.id) && Objects.equals(target, other.target);
	};
	
	

}
