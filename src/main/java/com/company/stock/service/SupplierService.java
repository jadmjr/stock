package com.company.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.stock.domain.Supplier;
import com.company.stock.repository.ISupplierRepository;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Service
public class SupplierService extends AbstractService<Supplier, Long> {
    @Autowired
    protected SupplierService(ISupplierRepository repository) {
        super(repository);
    }
}
