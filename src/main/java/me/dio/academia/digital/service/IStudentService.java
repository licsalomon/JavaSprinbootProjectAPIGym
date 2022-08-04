package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.PhysicalAssess;
import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.StudentForm;
import me.dio.academia.digital.entity.form.StudentUpdateForm;

import java.util.List;

public interface IStudentService {
    Student create(StudentForm form);
    Student get(Long id);
    List<Student> getAll(String birthDate);
    Student update(Long id, StudentUpdateForm studentUpdateForm);

    void delete(Long id);

    List<PhysicalAssess> getAllPhysicalAssessId(Long id);

//    List<PhysicalAssess> getAllPhysicalAssess();
}
