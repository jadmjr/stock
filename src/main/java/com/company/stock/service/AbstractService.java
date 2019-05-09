package com.company.stock.service;

import com.company.stock.domain.AbstractDomain;
import com.company.stock.repository.IGenericRepository;
import com.company.stock.utils.GenericResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author Julimar Junior.
 * Created on 05/05/19
 */
public class AbstractService<E extends AbstractDomain, K extends Serializable> {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final IGenericRepository<E, K> repository;

    protected AbstractService(IGenericRepository<E, K> repository) {
        this.repository = repository;
    }

    public GenericResponse save(E entity) {
        this.logger.trace("Save data: " + entity.toString());
        return new GenericResponse<E>()
                .setStatus(HttpStatus.CREATED.value())
                .setMessage(HttpStatus.CREATED.getReasonPhrase())
                .setContent(this.repository.save(entity));
    }

    public GenericResponse update(E entity) {
        this.logger.info("Update data: " + entity.toString());
        return new GenericResponse<E>()
                .setStatus(HttpStatus.ACCEPTED.value())
                .setMessage("Updated")
                .setContent(this.repository.save(entity));
    }

    public GenericResponse findById(K id) {
        this.logger.info("Get data: " + getClass().getSimpleName());
        return new GenericResponse<E>()
                .setStatus(HttpStatus.OK.value())
                .setMessage(HttpStatus.OK.getReasonPhrase())
                .setContent(this.repository.findById(id));
    }

    public Page<E> findAll(Pageable pageable) {
        this.logger.info("Get list data: " + getClass().getCanonicalName());
        return repository.findAll(pageable);
    }

    public void delete(E entity) {
        this.logger.info("Delete data: " + getClass().getCanonicalName());
        this.repository.delete(entity);
    }
}
