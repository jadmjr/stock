package com.company.stock.utils;


import java.util.Optional;

/**
 * @author Julimar Junior.
 * Created on 01/05/19
 */
public class GenericResponse<E> {
    private E content;
    private Integer status;
    private String message;

    public E getContent() {
        return content;
    }

    public GenericResponse<E> setContent(E content) {
        this.content = content;
        return this;
    }

    public GenericResponse setContent(Optional<E> content) {
        return content.<GenericResponse>map(this::setContent).orElse(null);
    }

    public Integer getStatus() {
        return status;
    }

    public GenericResponse<E> setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public GenericResponse<E> setMessage(String message) {
        this.message = message;
        return this;
    }
}
