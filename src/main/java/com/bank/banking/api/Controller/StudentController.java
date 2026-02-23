package com.bank.banking.api.Controller;

import com.bank.banking.api.Model.Student;
import com.bank.banking.api.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
