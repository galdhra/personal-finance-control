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
	
	@ManyToOne
	@JoinColumn(name="bank2_id")
	private Bank bank2;
	
	@ManyToMany
	@JoinTable(name = "tb_credit_card_debt",
	joinColumns = @JoinColumn(name = "credit_card_id"),
	inverseJoinColumns = @JoinColumn(name = "debt_id"))
	private Set<Debt> debtCreditCards = new HashSet<>();


	public CreditCard() {}

	public CreditCard(Long id, String name, String banner, Integer number, Double limit, Date dueDate, Boolean payed, Bank bank) {
		super();
		this.id = id;
		this.name = name;
		this.banner = banner;
		this.number = number;
		this.limit = limit;
		this.dueDate = dueDate;
		this.payed = payed;
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

	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getLimit() {
		return limit;
	}

	public void setLimit(Double limit) {
		this.limit = limit;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Boolean getPayed() {
		return payed;
	}

	public void setPayed(Boolean payed) {
		this.payed = payed;
	}

	public Bank getBank() {
		return bank2;
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
