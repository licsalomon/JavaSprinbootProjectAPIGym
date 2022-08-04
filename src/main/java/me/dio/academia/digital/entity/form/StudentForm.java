package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentForm {
    @NotBlank(message = "Please, fill the field.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' needs to have min {min} and {max} characters ")
    private String name;

    @NotBlank(message = "Please, fill the field.")
    //@CPF(message = "'${validatedValue}' is invalid ")
    private String cpf;

    @NotBlank(message = "Please, fill the field.")
    @Size(min = 3, max = 50, message = "'${validatedValue}' needs to have min {min} and {max} characters ")
    private String city;

    @NotNull(message = "Please, fill the field.")
    @Past(message = "'${validatedValue}' is invalid ")
    private LocalDate birthDate;
}
