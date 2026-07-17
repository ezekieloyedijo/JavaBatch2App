package jdbc.service;

import jdbc.dto.ResponseDto;
import jdbc.dto.StudentDto;
import jdbc.entity.Student;
import jdbc.repository.StudentRepository;

import java.util.Optional;

public class StudentService {
    private final StudentRepository studentRepository
            = new StudentRepository();

    public ResponseDto addStudent(StudentDto studentDto) {
        Student student = new Student(studentDto);
        System.out.println(student.toString());
        Optional<Student> optionalStudent = studentRepository.save(student);
        if(optionalStudent.isEmpty())
            return new ResponseDto(
                    false,
                    "Something went wrong!!!",
                    null);
        Student savedStudent = optionalStudent.get();


        return new ResponseDto(
                true,
                "Student created successfully",
                savedStudent
        );
    }

}
