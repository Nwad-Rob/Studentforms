package com.students.thymeleaf.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.thymeleaf.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByName(String stuentname);
    public List<Student> findByEmail(String email);
    public List<Student> findByDepartment(String department);
    
}
