package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.StudentForm;
import me.dio.academia.digital.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServiceImpl service;

    @GetMapping
    public List<Student> getAll(){
      return service.getAll();
    }
    @PostMapping
    public Student create(@RequestBody StudentForm form){
        return service.create(form);
    }
}
