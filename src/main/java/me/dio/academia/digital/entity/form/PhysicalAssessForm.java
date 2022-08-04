package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalAssessForm {
    @Positive(message = "The id needs to be a positive number")
    private Long studentId;

    @NotNull(message = "Please, fill the field.")
    @Positive(message = "'${validatedValue}' needs to be a positive number")
    private  double weight;

    @NotNull(message = "Please, fill the field.")
    @Positive(message = "'${validatedValue}' needs to be a positive number")
    @DecimalMin(value = "150", message = "'${validatedValue}' needs to be {value}.")
    private double height;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
