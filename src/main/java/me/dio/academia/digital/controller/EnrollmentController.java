package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Enrollment;
import me.dio.academia.digital.entity.form.EnrollmentForm;
import me.dio.academia.digital.service.impl.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentServiceImpl service;
    @PostMapping
    public Enrollment create(@Valid @RequestBody EnrollmentForm form) {return service.create(form);}

    @GetMapping
    public List<Enrollment> getAll(@RequestParam(value = "city", required = false)
                                   String city){
        return service.getAll(city);
    }

}
