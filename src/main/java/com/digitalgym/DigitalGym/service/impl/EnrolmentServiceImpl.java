package com.digitalgym.DigitalGym.service.impl;

import com.digitalgym.DigitalGym.entity.Enrolment;
import com.digitalgym.DigitalGym.entity.Member;
import com.digitalgym.DigitalGym.entity.form.EnrolmentForm;
import com.digitalgym.DigitalGym.repository.EnrolmentRepository;
import com.digitalgym.DigitalGym.repository.MemberRepository;
import com.digitalgym.DigitalGym.service.IEnrolmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EnrolmentServiceImpl implements IEnrolmentService {

    @Autowired
    private EnrolmentRepository enrolmentRepository;

    @Autowired
    private MemberRepository memberRepository;


    @Override
    public Enrolment create(EnrolmentForm form) {
        Enrolment enrolment = new Enrolment();
        Member member = memberRepository.findById(form.getMemberId()).get();

        enrolment.setMember(member);

        return enrolmentRepository.save(enrolment);
    }

    @Override
    public Enrolment get(Long id) {
        return enrolmentRepository.findById(id).get();
    }

    @Override
    public List<Enrolment> getAll(String city) {

        if(city == null){
            return enrolmentRepository.findAll();
        } else {
            return null;
        }
    }

    @Override
    public void delete(Long id) {

    }
}
