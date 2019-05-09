package com.company.stock.service;

import com.company.stock.domain.Company;
import com.company.stock.repository.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@Service
public class CompanyService extends AbstractService<Company, Long> {
    @Autowired
    protected CompanyService(ICompanyRepository repository) {
        super(repository);
    }
}
