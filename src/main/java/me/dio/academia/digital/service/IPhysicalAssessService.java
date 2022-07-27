package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.PhysicalAssess;
import me.dio.academia.digital.entity.form.PhysicalAssessForm;
import me.dio.academia.digital.entity.form.PhysicalAssessUpdateForm;

import java.util.List;

public interface IPhysicalAssessService {
    PhysicalAssess create(PhysicalAssessForm form);
    PhysicalAssess get(Long id);
    List<PhysicalAssess> getAll();
    PhysicalAssess update(Long id, PhysicalAssessUpdateForm formUpdate);
    void delete(Long id);

}
