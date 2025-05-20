package com.galdhra.fnpers.entities;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_credit_card")
public class CreditCard {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String name;
	private String banner;
	private Integer number;
	private Double limit;
	private Date dueDate;
	private Boolean payed;

	public CreditCard() {}

	public CreditCard(Long id, String name, String banner, Integer number, Double limit, Date dueDate, Boolean payed) {
		super();
		this.id = id;
		this.name = name;
		this.banner = banner;
		this.number = number;
		this.limit = limit;
		this.dueDate = dueDate;
		this.payed = payed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditCard other = (CreditCard) obj;
		return Objects.equals(id, other.id) && Objects.equals(number, other.number);
	};
	
	

}
