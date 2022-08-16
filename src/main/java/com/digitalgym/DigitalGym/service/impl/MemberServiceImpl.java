package com.digitalgym.DigitalGym.service.impl;

import com.digitalgym.DigitalGym.entity.Member;
import com.digitalgym.DigitalGym.entity.PhysicalAssessment;
import com.digitalgym.DigitalGym.repository.MemberRepository;
import com.digitalgym.DigitalGym.entity.form.MemberForm;
import com.digitalgym.DigitalGym.entity.form.MemberUpdateForm;
import com.digitalgym.DigitalGym.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements IMemberService {

    @Autowired
    private MemberRepository repository;


    @Override
    public Member create(MemberForm form) {
        return null;
    }

    @Override
    public Member get(Long id) {
        return null;
    }

    @Override
    public List<Member> getAll(String birthDate) {
       return repository.findAll();

    }

    @Override
    public Member update(Long id, MemberUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id) {
        return null;
    }

}
