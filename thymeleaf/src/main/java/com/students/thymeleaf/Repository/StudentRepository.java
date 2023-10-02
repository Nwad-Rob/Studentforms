package com.students.thymeleaf.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.students.thymeleaf.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
  
    
}
