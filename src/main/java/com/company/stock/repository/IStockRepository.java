package com.company.stock.repository;

import com.company.stock.domain.Stock;
import org.springframework.stereotype.Repository;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Repository
public interface IStockRepository extends IGenericRepository<Stock, Long> { }
