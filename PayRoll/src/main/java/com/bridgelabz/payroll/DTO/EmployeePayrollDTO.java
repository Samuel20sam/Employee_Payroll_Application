package com.bridgelabz.payroll.DTO;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Employee name cannot be less than three characters")
    @NotEmpty(message = "Employee name cannot be null")
    public String name;
    @Min(value = 500, message = "Minimum wage should be more than 500")
    public Long salary;

    public EmployeePayrollDTO(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}