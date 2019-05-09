package com.company.stock.domain;

import com.company.stock.domain.interfaces.IDomain;

import javax.persistence.*;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@MappedSuperclass
public class AbstractDomain implements IDomain {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Override
    public Object setID(final Long id) {
        this.id = id;
        return this;
    }

    @Override
    public Long getID() {
        return this.id;
    }
}
