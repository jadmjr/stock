package com.company.stock.resource;

import com.company.stock.domain.AbstractDomain;
import com.company.stock.domain.interfaces.IDomain;
import com.company.stock.service.AbstractService;
import com.company.stock.utils.GenericResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;
import javax.validation.Valid;
import java.io.Serializable;
import java.util.Optional;

/**
 * @author Julimar Junior.
 *  Created on 28/04/19
 */
@MappedSuperclass
public abstract class AbstractResource<T extends AbstractDomain, K extends Serializable> {
    private final AbstractService<T, K> service;

    protected AbstractResource(AbstractService<T, K> service) {
        this.service = service;
    }

    @PostMapping
    public GenericResponse save(@Valid @RequestBody T entity) {
        return service.save(entity);
    }

    @PutMapping
    public GenericResponse update(@Valid @RequestBody T entity) {
        return service.update(entity);
    }

    @GetMapping(value = "/{id}")
    public GenericResponse findById(@PathVariable(value = "id") K id) {
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Page<T> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable(value = "id") K id) {
        Object optResource =  this.service.findById(id).getContent();
        this.service.delete((T) optResource);
    }
}
