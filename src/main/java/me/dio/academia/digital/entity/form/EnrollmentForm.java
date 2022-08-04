package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class EnrollmentForm {
    @NotNull(message = "Please, fill the field.")
    @Positive(message = "The id needs to be a positive number")
    private Long studentId;
}
