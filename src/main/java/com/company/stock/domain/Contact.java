package com.company.stock.domain;

import javax.persistence.Entity;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Entity
public class Contact extends AbstractDomain {
    private String name;
    private String phone;
    private String cellPhone;

    Contact(){}

    public String getName() {
        return name;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public Contact setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
        return this;
    }
}
