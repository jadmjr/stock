package com.company.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.stock.domain.Product;
import com.company.stock.repository.IProductRepository;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Service
public class ProductService extends AbstractService<Product, Long> {
    @Autowired
    protected ProductService(IProductRepository repository) {
        super(repository);
    }
}
