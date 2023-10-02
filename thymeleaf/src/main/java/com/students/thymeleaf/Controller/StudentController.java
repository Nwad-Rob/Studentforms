package com.students.thymeleaf.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.students.thymeleaf.Model.Student;
import com.students.thymeleaf.Repository.StudentRepository;

@Controller

public class StudentController {
    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/showStudents")
    public ModelAndView showStudents(){
        ModelAndView mav = new ModelAndView("list-students");
        List<Student> studentList = studentRepo.findAll();
        mav.addObject("students", studentList);
        return mav;
    }
}
