package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.PhysicalAssess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalAssesRepository extends JpaRepository<PhysicalAssess, Long> {
}
