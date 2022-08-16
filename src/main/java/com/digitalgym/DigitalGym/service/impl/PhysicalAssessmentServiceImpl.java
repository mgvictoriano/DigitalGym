package com.digitalgym.DigitalGym.service.impl;

import com.digitalgym.DigitalGym.entity.Member;
import com.digitalgym.DigitalGym.entity.PhysicalAssessment;
import com.digitalgym.DigitalGym.entity.form.PhysicalAssessmentForm;
import com.digitalgym.DigitalGym.entity.form.PhysicalAssessmentUpdateForm;
import com.digitalgym.DigitalGym.repository.AssessmentRepository;
import com.digitalgym.DigitalGym.repository.MemberRepository;
import com.digitalgym.DigitalGym.service.IPhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalAssessmentServiceImpl implements IPhysicalAssessmentService {

    @Autowired
    private AssessmentRepository assessmentRepository;

    @Autowired
    private MemberRepository memberRepository;


    @Override
    public PhysicalAssessment create(PhysicalAssessmentForm form) {
        PhysicalAssessment physicalAssessment = new PhysicalAssessment();
        Member member = memberRepository.findById(form.getMemberId()).get();

        physicalAssessment.setMember(member);
        physicalAssessment.setWeight(form.getWeight());
        physicalAssessment.setHeight(form.getHeight());

      // return AssessmentRepository.save(physicalAssessment);
        return null;
    }

    @Override
    public PhysicalAssessment get(Long id) {
        return null;

    }

    @Override
    public List<PhysicalAssessment> getAll() {

        return assessmentRepository.findAll();
    }

    @Override
    public PhysicalAssessment update(Long id, PhysicalAssessmentUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id)    {
    }


}

