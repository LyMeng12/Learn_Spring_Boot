package com.bank.banking.api.Controller;

import com.bank.banking.api.model.Student;
import com.bank.banking.api.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

}
