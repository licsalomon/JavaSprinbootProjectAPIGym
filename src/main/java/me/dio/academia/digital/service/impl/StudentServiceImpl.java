package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.PhysicalAssess;
import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.StudentForm;
import me.dio.academia.digital.entity.form.StudentUpdateForm;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.StudentRepository;
import me.dio.academia.digital.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(StudentForm form) {
        Student student = new Student();
        student.setName(form.getName());
        student.setCpf(form.getCpf());
        student.setCity(form.getCity());
        student.setBirthDate(form.getBirthDate());

        return repository.save(student);
    }

    @Override
    public Student get(Long id) {
        return null;
    }

//    @Override
//    public List<Student> getAll(String birthDate) {
//        return null;
//    }

    @Override
    public List<Student> getAll(String birthDate) {

        if(birthDate == null){
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(birthDate,
                    JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDateBirth(localDate);
        }

    }

    @Override
    public Student update(Long id, StudentUpdateForm studentUpdateForm) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PhysicalAssess> getAllPhysicalAssessId(Long id) {
        Student student = repository.findById(id).get();
        return student.getAssessts();
    }

//    @Override
//    public List<PhysicalAssess> getAllPhysicalAssess() {
//       studentRepository.getAllPhysicalAssess
//
//        return null;
//    }
}
