package com.company.stock.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.stock.domain.Product;
import com.company.stock.service.ProductService;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@RestController
@CrossOrigin
@RequestMapping("products")
public class ProductResource extends AbstractResource<Product, Long> {
    @Autowired
    protected ProductResource(ProductService service) {
        super(service);
    }
}
