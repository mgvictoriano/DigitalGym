package com.digitalgym.DigitalGym.entity.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessmentForm {

    private Long memberId;
    private double weight;
    private double height;

}
