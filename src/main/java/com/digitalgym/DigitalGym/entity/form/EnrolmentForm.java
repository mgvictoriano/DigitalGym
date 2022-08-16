package com.digitalgym.DigitalGym.entity.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrolmentForm {

    @NotNull(message = "Please, fill in the field correctly.")
    @Positive(message = "Member ID must be positive.")
    private Long memberId;

}
