package com.digitalgym.DigitalGym.service;

import com.digitalgym.DigitalGym.entity.PhysicalAssessment;
import com.digitalgym.DigitalGym.entity.form.PhysicalAssessmentForm;
import com.digitalgym.DigitalGym.entity.form.PhysicalAssessmentUpdateForm;

import java.util.List;

public interface IPhysicalAssessmentService {
    PhysicalAssessment create(PhysicalAssessmentForm form);

    PhysicalAssessment get(Long id);

    List<PhysicalAssessment> getAll();

    PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate);

    void delete(Long id);
}
