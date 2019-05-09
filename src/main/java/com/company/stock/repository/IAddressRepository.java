package com.company.stock.repository;

import com.company.stock.domain.Address;
import org.springframework.stereotype.Repository;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Repository
public interface IAddressRepository extends IGenericRepository<Address, Long> { }
