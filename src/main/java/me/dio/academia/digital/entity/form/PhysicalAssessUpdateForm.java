package me.dio.academia.digital.entity.form;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class PhysicalAssessUpdateForm {
    @NotNull(message = "Please, fill the field.")
    @Positive(message = "'${validatedValue}' needs to be a positive number")
    private  double weight;

    @NotNull(message = "Please, fill the field.")
    @Positive(message = "'${validatedValue}' needs to be a positive number")
    @DecimalMin(value = "150", message = "'${validatedValue}' needs to be {value}.")
    private double height;
}
