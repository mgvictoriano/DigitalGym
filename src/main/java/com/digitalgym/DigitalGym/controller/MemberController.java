package com.digitalgym.DigitalGym.controller;

import com.digitalgym.DigitalGym.entity.Member;
import com.digitalgym.DigitalGym.entity.PhysicalAssessment;
import com.digitalgym.DigitalGym.service.impl.MemberServiceImpl;
import com.digitalgym.DigitalGym.entity.form.MemberForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {


    @Autowired
    private MemberServiceImpl service;

    @PostMapping
    public Member create(@Valid @RequestBody MemberForm form) {
        return service.create(form);
    }

    @GetMapping("/assessments/{id}")
    public List<PhysicalAssessment> getAllPhysicalAssessmentId(@PathVariable Long id) {
        return service.getAllPhysicalAssessmentId(id);
    }

    @GetMapping
    public List<Member> getAll(@RequestParam(value = "birthDate", required = false)
                              String birthDate){
        return service.getAll(birthDate);
    }
}
