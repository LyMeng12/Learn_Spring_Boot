package com.bank.banking.api.service;

import com.bank.banking.api.dto.StudentRequest;
import com.bank.banking.api.dto.StudentRespones;

import java.util.List;

public interface StudentService {
    void save(StudentRequest studentRequest);
    void update(Long id,StudentRequest studentRequest);
    void delete(Long id);
    StudentRespones getById(Long id);
    List<StudentRespones> getAll();

}
