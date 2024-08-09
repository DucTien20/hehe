package com.example.crud.mapper;

import com.example.crud.model.Student;

import java.util.List;

public interface StudentMapperX {
    void insertStudent(Student student);
    List<Student> selectStudentAll();
    Student selectStudent(Long id);

    void updateStudent(Student student);
    void deleteStudent(Long id);
}
