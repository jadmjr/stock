package com.company.stock.resource;

import com.company.stock.domain.Company;
import com.company.stock.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
@RestController
@CrossOrigin
@RequestMapping("companies")
public class CompanyResource extends AbstractResource<Company, Long> {
    @Autowired
    protected CompanyResource(CompanyService service) {
        super(service);
    }
}
