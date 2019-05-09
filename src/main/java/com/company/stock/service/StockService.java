package com.company.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.stock.domain.Stock;
import com.company.stock.repository.IStockRepository;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Service
public class StockService extends AbstractService<Stock, Long> {
    @Autowired
    protected StockService(IStockRepository repository) {
        super(repository);
    }
}
