package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Enrollment;
import me.dio.academia.digital.entity.form.EnrollmentForm;

import java.util.List;

public interface IEnrollmentService {
    Enrollment create(EnrollmentForm form);
    Enrollment get(Long id);
    List<Enrollment> getAll(String city);
    void delete(Long id);
}
