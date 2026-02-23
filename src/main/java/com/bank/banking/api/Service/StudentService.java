package com.bank.banking.api.Service;

import com.bank.banking.api.Model.Student;
import com.bank.banking.api.Repository.StudentRepository;
import com.bank.banking.api.configuration.RandomIdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    // 1️⃣ Add the repository field
    private final StudentRepository studentRepository;

    // 2️⃣ RandomIdGenerator field already exists
    private final RandomIdGenerator idGenerator;

    // 3️⃣ Constructor injection for both dependencies
    @Autowired
    public StudentService(StudentRepository studentRepository, RandomIdGenerator idGenerator) {
        this.studentRepository = studentRepository;
        this.idGenerator = idGenerator;
    }

    // Example method using both
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(String name) {
        Long randomId = idGenerator.generateId();
        Student student = new Student();
        student.setId(randomId);
        student.setName(name);
        return studentRepository.save(student);
    }
}
