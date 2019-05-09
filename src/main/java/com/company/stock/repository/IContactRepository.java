package com.company.stock.repository;

import com.company.stock.domain.Contact;
import org.springframework.stereotype.Repository;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Repository
public interface IContactRepository extends IGenericRepository<Contact, Long> { }
