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
@Table(name = "tb_income")
public class Income {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private String source;	
	private Date date;
	private Double amount;
	
	@Column(columnDefinition = "TEXT")
	private String observation;
	
	
	private Income() {}


	public Income(Long id, String name, String source, Date date, Double amount, String observation) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.date = date;
		this.amount = amount;
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


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
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
		Income other = (Income) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(date, other.date) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	};
	
	
	
}


