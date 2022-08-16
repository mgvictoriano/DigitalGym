package com.digitalgym.DigitalGym.service;

import com.digitalgym.DigitalGym.entity.Enrolment;
import com.digitalgym.DigitalGym.entity.form.EnrolmentForm;

import java.util.List;

public interface IEnrolmentService {

    Enrolment create(EnrolmentForm form);

    Enrolment get(Long id);

    List<Enrolment> getAll(String city);

    void delete(Long id);


}
