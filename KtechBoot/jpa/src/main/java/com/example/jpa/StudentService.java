package com.example.jpa;

import com.example.jpa.model.Instructor;
import com.example.jpa.model.Student;
import com.example.jpa.repo.InstructorRepository;
import com.example.jpa.repo.StudentRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository repository;
    private final InstructorRepository instructorRepository;
    public StudentService(
            StudentRepository repository,
            InstructorRepository instuctorRepository
    ){
        this.repository = repository;
        this.instructorRepository = instuctorRepository;
    }
    //READ

    public List<Student> readALl (){
       return repository.findAll();
    }

    public Student readOne(Long id){
        Optional<Student> student = repository.findById(id);
        System.out.println("Advisor" + student.get().getAdvisor());
        return student.orElse(null);
    }

    // CREATE
public Student create(
        String name,
        Integer age,
        String email,
        String phone,
        Long advisorId
) {
    Student student = new Student();
    student.setName(name);
    student.setAge(age);
    student.setEmail(email);
    student.setPhone(phone);
    //교수 찾은다
    Optional<Instructor> instructorOpt = instructorRepository.findById(1L);
    // truoc khi save hoc sinh moi thi them vao advisor
    student.setAdvisor(instructorOpt.orElse(null));
    return repository.save(student);
}
}
