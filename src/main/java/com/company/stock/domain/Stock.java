package com.company.stock.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author Julimar Junior. Created on 05/05/19
 */
@Entity
public class Stock extends AbstractDomain {

	private Double amount;
	private Double sell;
	private Double purchase;
	@OneToMany
	private List<Product> products;

	Stock() {
	}
	
	
	
	public Double getSell() {
		return sell;
	}



	public void setSell(Double sell) {
		this.sell = sell;
	}



	public Double getPurchase() {
		return purchase;
	}



	public void setPurchase(Double purchase) {
		this.purchase = purchase;
	}



	public Double getAmount() {
		return amount;
	}

	public Stock setAmount(Double amount) {
		this.amount = amount;
		return this;
	}

	public List<Product> getProducts() {
		return products;
	}

	public Stock setProducts(List<Product> products) {
		this.products = products;
		return this;
	}

}
