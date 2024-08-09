package com.example.crud;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {
    private Long nextId = 1L;
    private final List<StudentDto> studentList = new ArrayList<>();

    private StudentRepository repository;
    public StudentService(StudentRepository repository){
    this.repository = repository;
}


public StudentDto createStudent(
            String name,
            String email
    ) {

        StudentDto newStudent = new StudentDto(nextId, name, email);

        nextId++;
        System.out.println(newStudent);
        studentList.add(newStudent);
        repository.create(newStudent);
        return newStudent;
    }

    public List<StudentDto> getAllStudent() {
        return studentList;
    }

    public StudentDto readStudent(Long id) {
        for (StudentDto studentDto : studentList) {
            if (studentDto.getId().equals(id)) {
                return studentDto;
            }
        }
        return null;
    }

    public StudentDto updateStudent(
            Long id,
            String name,
            String email
    ) {
        //dia chi cua hojc sinh can tim
        int targetIdx = -1;
        for (int i = 0; i < studentList.size(); i++) {
            StudentDto dto = studentList.get(i);
            //nei id hs dung
            if (dto.getId().equals(id)) {
                // thi luu lai
                targetIdx = i;
                break;
            }
        }
        // neu da tim duoc dung doi tuong va !=-1
        if (targetIdx != -1) {
            // thay doi ten va email cuar doi tuong
            studentList.get(targetIdx).setName(name);
            studentList.get(targetIdx).setEmail(email);
            return studentList.get(targetIdx);
        }
        return null;
    }

    public boolean deleteStudent(Long id) {
        int targetIdx = -1;
        for (int i = 0; i < studentList.size(); i++) {
            StudentDto dto = studentList.get(i);
            //nei id hs dung
            if (dto.getId().equals(id)) {
                // thi luu lai
                targetIdx = i;
                break;
            }

        }
        if (targetIdx != -1) {
            studentList.remove(targetIdx);
            return true;
        }
        return false;
    }
}
