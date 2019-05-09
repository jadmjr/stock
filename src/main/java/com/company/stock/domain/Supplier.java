package com.company.stock.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Entity
public class Supplier extends AbstractDomain {
    private String name;
	
    @OneToMany
    private Set<Contact> contacts;

    public String getName() {
        return name;
    }

    public Supplier setName(String name) {
        this.name = name;
        return this;
    }
}
