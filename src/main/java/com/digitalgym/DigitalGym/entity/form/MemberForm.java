package com.digitalgym.DigitalGym.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberForm {

    @NotEmpty(message = "Please, fill in the field correctly.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' must to be between {min} e {max} characters.")
    private String name;

    @NotEmpty(message = "Please, fill in the field correctly.")
    @CPF(message =  "'${validatedValue}' is invalid!")
    private String cpf;

    @NotEmpty(message = "Please, fill in the field correctly.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' must to be between {min} e {max} characters.")
    private String city;

    @NotEmpty(message = "Please, fill in the field correctly.")
    @Past(message = "Date '${validatedValue}' is invalid!")
    private LocalDate birthDate;

}
