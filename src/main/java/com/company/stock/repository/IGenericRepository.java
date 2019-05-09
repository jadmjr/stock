package com.company.stock.repository;

import com.company.stock.domain.AbstractDomain;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Julimar Junior.
 * Created on 01/05/19
 */
public interface IGenericRepository<E extends AbstractDomain, K> extends JpaRepository<E, K> {
}
