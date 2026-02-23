package com.bank.banking.api.Controller;

import com.bank.banking.api.Model.Student;
import com.bank.banking.api.Service.StudentService;
import com.bank.banking.api.Service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/university")
public class Controller {

    private final StudentService studentService;
    private final TeacherService teacherService;


    public Controller(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/post/student")
    public Student postStudent(@RequestBody Student student) {
        return studentService.createStudent(student.getName());
    }

    @GetMapping("/course-names")
    public List<String> getCourseNames() {
        return teacherService.getAllCourseNames();
    }
}
