package io.javaapp.generics_02.service.impl;

import io.javaapp.generics_02.dto.ResponseDto;
import io.javaapp.generics_02.dto.TeacherDto;
import io.javaapp.generics_02.entity.Teacher;
import io.javaapp.generics_02.service.IGenericService;

public class TeacherService implements IGenericService<Teacher, TeacherDto> {
    @Override
    public ResponseDto create(TeacherDto dto) {
        return null;
    }

    @Override
    public Teacher getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
