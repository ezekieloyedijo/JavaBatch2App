package io.javaapp.generics_02.service;

import io.javaapp.generics_02.dto.ResponseDto;

public interface IGenericService<K, T> {
    ResponseDto create(T dto);
    K getById(Long id);
    void delete(Long id);

}

