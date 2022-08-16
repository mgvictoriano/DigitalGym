package com.digitalgym.DigitalGym.repository;

import com.digitalgym.DigitalGym.entity.PhysicalAssessment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepository extends JpaRepository<PhysicalAssessment, Long>{
}
