package com.bank.banking.api.Repository;

import com.bank.banking.api.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
