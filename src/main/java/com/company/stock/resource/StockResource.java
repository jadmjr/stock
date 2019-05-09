package com.company.stock.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.stock.domain.Stock;
import com.company.stock.service.StockService;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@RestController
@CrossOrigin
@RequestMapping("stock")
public class StockResource extends AbstractResource<Stock, Long> {
    @Autowired
    protected StockResource(StockService service) {
        super(service);
    }
}
