package com.bank.banking.api.Service;

import com.bank.banking.api.Model.Student;
import com.bank.banking.api.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentSerivce {
    @Autowired
    private StudentRepository studentRepository;

    List<Student> StudentAll(){
        return studentRepository.findAll();
    }
}
