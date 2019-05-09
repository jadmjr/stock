package com.company.stock.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.stock.domain.Supplier;
import com.company.stock.service.SupplierService;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@RestController
@CrossOrigin
@RequestMapping("suppliers")
public class SupplierResource extends AbstractResource<Supplier, Long> {
    @Autowired
    protected SupplierResource(SupplierService service) {
        super(service);
    }
}
