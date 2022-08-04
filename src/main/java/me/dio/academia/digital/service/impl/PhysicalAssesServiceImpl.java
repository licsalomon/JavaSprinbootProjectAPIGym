package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.PhysicalAssess;
import me.dio.academia.digital.entity.Student;
import me.dio.academia.digital.entity.form.PhysicalAssessForm;
import me.dio.academia.digital.entity.form.PhysicalAssessUpdateForm;
import me.dio.academia.digital.repository.PhysicalAssesRepository;
import me.dio.academia.digital.repository.StudentRepository;
import me.dio.academia.digital.service.IPhysicalAssessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssesServiceImpl implements IPhysicalAssessService {

    @Autowired
    private PhysicalAssesRepository physicalAssesRepository;

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public PhysicalAssess create(PhysicalAssessForm form) {
    PhysicalAssess physicalAssess = new PhysicalAssess();
    Student student = studentRepository.findById(form.getStudentId()).get();

    physicalAssess.setStudent(student);
    physicalAssess.setWeight(form.getWeight());
    physicalAssess.setHeight(form.getHeight());

    return physicalAssesRepository.save(physicalAssess);
    }

    @Override
    public PhysicalAssess get(Long id) {
        return null;
    }

    @Override
    public List<PhysicalAssess> getAll() {
        return null;
    }

    @Override
    public PhysicalAssess update(Long id, PhysicalAssessUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
