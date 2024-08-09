package com.example.jpa.repo;

import com.example.jpa.model.Instructor;
import com.example.jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository  extends JpaRepository<Student, Long> {
// tim thanh phaan ? trong danh sac
    /*
    SELECT * FROM student WHERE LIKE '%{?}'
    */
    List<Student> findAllByEmailEndingWith(String email);
    List<Student> findAllByAdvisor(Instructor advisor);
    List<Student> findAllByAdvisorId(Long id);
    List<Student> findAllByAdvisorLastName(String lastName);
}
