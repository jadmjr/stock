package com.company.stock.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.stock.domain.Contact;
import com.company.stock.service.ContactService;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@RestController
@CrossOrigin
@RequestMapping("contacts")
public class ContactResource extends AbstractResource<Contact, Long> {
    @Autowired
    protected ContactResource(ContactService service) {
        super(service);
    }
}
