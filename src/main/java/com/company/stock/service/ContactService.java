package com.company.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.stock.domain.Contact;
import com.company.stock.repository.IContactRepository;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Service
public class ContactService extends AbstractService<Contact, Long> {
    @Autowired
    protected ContactService(IContactRepository repository) {
        super(repository);
    }
}
