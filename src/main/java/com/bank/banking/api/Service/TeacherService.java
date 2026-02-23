package com.bank.banking.api.Service;

import com.bank.banking.api.Model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final CourseService courseService;

    public TeacherService(CourseService courseService) {
        this.courseService = courseService;
    }

    public List<String> getAllCourseNames() {
        return courseService.getAllCourses()
                .stream()
                .map(Course::getCoursename)
                .toList();
    }
}
