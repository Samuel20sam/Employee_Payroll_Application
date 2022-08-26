package com.bridgelabz.payroll.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@ToString
public class EmployeePayrollDTO {
//    @Pattern(regexp = "^[0-9]+$", message = "ID can only be number")
//    @Min(value = 1, message = "ID cannot be 0")
    public int employeeID;
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Employee name cannot be less than three characters")
    @NotEmpty(message = "Employee name cannot be null")
    public String name;
    @Min(value = 500, message = "Minimum wage should be more than 500")
    public Long salary;
    public String gender;
    @JsonFormat(pattern = "dd-MM-yyyy")
    public LocalDate startDate;
    public String note;
    public String profilePicture;
    public List<String> departments;
}