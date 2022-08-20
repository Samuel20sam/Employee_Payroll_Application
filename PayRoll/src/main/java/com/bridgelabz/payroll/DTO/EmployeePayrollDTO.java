package com.bridgelabz.payroll.DTO;

public class EmployeePayrollDTO {
    public String name;
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
