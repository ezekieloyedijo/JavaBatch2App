package io.javaapp.generics_02.service.impl;

import io.javaapp.generics_02.dto.ResponseDto;
import io.javaapp.generics_02.dto.StudentDto;
import io.javaapp.generics_02.entity.Student;
import io.javaapp.generics_02.service.IGenericService;

public class StudentService implements IGenericService<Student, StudentDto> {
    @Override
    public ResponseDto create(StudentDto dto) {
        return null;
    }

    @Override
    public Student getById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
