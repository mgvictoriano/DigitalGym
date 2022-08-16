package com.digitalgym.DigitalGym.service;


import com.digitalgym.DigitalGym.entity.Member;
import com.digitalgym.DigitalGym.entity.PhysicalAssessment;
import com.digitalgym.DigitalGym.entity.form.MemberForm;
import com.digitalgym.DigitalGym.entity.form.MemberUpdateForm;


import java.util.List;

public interface IMemberService {

    Member create(MemberForm form);

    Member get(Long id);

    List<Member> getAll (String birthDate);

    Member update(Long id, MemberUpdateForm formUpdate);

    void delete(Long id);

    List<PhysicalAssessment> getAllPhysicalAssessmentId(Long id);




}
