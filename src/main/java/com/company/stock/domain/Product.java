package com.company.stock.domain;

import javax.persistence.Entity;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Entity
public class Product extends AbstractDomain {
    private String name;
    private Double purchasePrice;
    private Double sellPrice;

    Product(){}    

	public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public Product setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public Product setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }


	public Product(String name, Double purchasePrice, Double sellPrice) {
		super();
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.sellPrice = sellPrice;
	}
}
