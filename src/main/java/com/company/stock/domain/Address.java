package com.company.stock.domain;

import javax.persistence.Entity;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Entity
public class Address extends AbstractDomain {
    private String address;
    private Integer number;
    private String city;
    private String zip;
    private String state;

    Address(){}
    
    
	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getAddress() {
        return address;
    }

    public Address setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public String getZip() {
        return zip;
    }

    public Address setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }
}
