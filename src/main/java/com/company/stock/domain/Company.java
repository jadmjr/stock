package com.company.stock.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Julimar Junior. Created on 05/05/19
 */
@Entity
public class Company extends AbstractDomain {
	private String name;
	@OneToMany
	private Set<Stock> stocks;
	@OneToOne
	private Address addresses;

	Company() {
	}

	public String getName() {
		return name;
	}

	public Company setName(String name) {
		this.name = name;
		return this;
	}

	public Set<Stock> getStocks() {
		return stocks;
	}

	public Company setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
		return this;
	}

	public Address getAddresses() {
		return addresses;
	}

	public Company setAddresses(Address addresses) {
		this.addresses = addresses;
		return this;
	}
}
