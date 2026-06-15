package spring.web.app.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import spring.web.app.project.entity.Student;
import spring.web.app.project.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name) {

        Student student = studentRepository.getByName(name);

        return ResponseEntity.ok(student);
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<Student> getStudentByCity(@PathVariable String city) {

        Student student = studentRepository.getByCity(city);

        return ResponseEntity.ok(student);
    }
}