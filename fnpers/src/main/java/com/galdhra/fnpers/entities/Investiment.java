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
@Table(name = "tb_investiment")
public class Investiment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private Date date;
	private Double initialAmount;
	private Double redemption;
	private Bank bank;
	
	@Column(columnDefinition = "TEXT")
	private String observation;

	public Investiment(Long id, String name, Date date, Double initialAmount, Double redemption, Bank bank, String observation) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.initialAmount = initialAmount;
		this.redemption = redemption;
		this.bank = bank;
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

	public Double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(Double initialAmount) {
		this.initialAmount = initialAmount;
	}

	public Double getRedemption() {
		return redemption;
	}

	public void setRedemption(Double redemption) {
		this.redemption = redemption;
	}
	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, id, initialAmount, redemption);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Investiment other = (Investiment) obj;
		return Objects.equals(date, other.date) && Objects.equals(id, other.id)
				&& Objects.equals(initialAmount, other.initialAmount) && Objects.equals(redemption, other.redemption);
	}
	
	

}
