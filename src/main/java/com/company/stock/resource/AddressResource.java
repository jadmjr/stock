package com.company.stock.resource;

import com.company.stock.domain.Address;
import com.company.stock.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@RestController
@CrossOrigin
@RequestMapping("addresses")
public class AddressResource extends AbstractResource<Address, Long> {
    @Autowired
    protected AddressResource(AddressService service) {
        super(service);
    }
}
