package com.bridgelabz.payroll.repo;

import com.bridgelabz.payroll.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepo extends JpaRepository<EmployeePayrollData, Integer> {
}
