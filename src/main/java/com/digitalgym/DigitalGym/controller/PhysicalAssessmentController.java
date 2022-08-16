package com.digitalgym.DigitalGym.controller;

import com.digitalgym.DigitalGym.entity.PhysicalAssessment;
import com.digitalgym.DigitalGym.entity.form.PhysicalAssessmentForm;
import com.digitalgym.DigitalGym.service.impl.PhysicalAssessmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/assessments")
public class PhysicalAssessmentController {

    @Autowired
    private PhysicalAssessmentServiceImpl service;

    @PostMapping
    public PhysicalAssessment create(@RequestBody PhysicalAssessmentForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<PhysicalAssessment> getAll(){
        return null;
    }
}
