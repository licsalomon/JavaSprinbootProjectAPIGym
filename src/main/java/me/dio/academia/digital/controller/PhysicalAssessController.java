package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.PhysicalAssess;
import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.PhysicalAssessForm;
import me.dio.academia.digital.entity.form.StudentForm;
import me.dio.academia.digital.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asses")
public class PhysicalAssessController {
    @Autowired
    private StudentServiceImpl service;

//    @GetMapping
//    public List<Student> getAll(){
//        return service.getAll();
//    }
    @PostMapping
    public PhysicalAssess create(@RequestBody PhysicalAssessForm form){
        return service.create(form);
    }
}
