package com.bridgelabz.payroll.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

@ToString
public class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Employee name cannot be less than three characters")
    @NotEmpty(message = "Employee name cannot be null")
    public String name;

    @Min(value = 500, message = "Minimum wage should be more than 500")
    public Long salary;

    @Pattern(regexp = "Male|Female", message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd-MM-yyyy")
    @NotNull(message = "startDate should not be empty")
    @PastOrPresent(message = "startDate should be past or today's date")
    public LocalDate startDate;

    @NotBlank(message = "Note should not be empty")
    public String note;

    @NotBlank(message = "profile pic should not be empty")
    public String profilePicture;

    @NotNull(message = "department should not be empty")
    public List<String> departments;
}