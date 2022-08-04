package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.PhysicalAssess;
import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.StudentForm;
import me.dio.academia.digital.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServiceImpl service;

    @GetMapping
    public List<Student> getAll(@RequestParam(
            value = "birthDate",
            required = false)
                                    String birthDate){
        return service.getAll(birthDate);
    }
    @PostMapping
    public Student create(@Valid @RequestBody StudentForm form){
        return service.create(form);
    }
    @GetMapping("/assess/{id}")
    public List<PhysicalAssess> getAllPhysicalAssessId(@PathVariable Long id) {
        return service.getAllPhysicalAssessId(id);
    }
}
