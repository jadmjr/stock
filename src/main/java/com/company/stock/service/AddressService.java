package com.company.stock.service;

import com.company.stock.domain.Address;
import com.company.stock.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Service
public class AddressService extends AbstractService<Address, Long> {
    @Autowired
    protected AddressService(IAddressRepository repository) {
        super(repository);
    }
}
