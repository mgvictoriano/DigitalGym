package com.digitalgym.DigitalGym.controller;

import com.digitalgym.DigitalGym.entity.Enrolment;
import com.digitalgym.DigitalGym.service.impl.EnrolmentServiceImpl;
import com.digitalgym.DigitalGym.entity.form.EnrolmentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/enrolments")
public class EnrolmentController {

    @Autowired
    private EnrolmentServiceImpl service;

    @PostMapping
    public Enrolment create(@Valid @RequestBody EnrolmentForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Enrolment> getAll(@RequestParam(value = "city", required = false) String city) {
        return service.getAll(city);
    }
}
