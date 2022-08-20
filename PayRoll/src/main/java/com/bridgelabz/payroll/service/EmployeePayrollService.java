package com.bridgelabz.payroll.service;

import com.bridgelabz.payroll.DTO.EmployeePayrollDTO;
import com.bridgelabz.payroll.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements EmployeePayrollServiceImpl{
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        employeePayrollList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Samuel", 30000L)));
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Steven", 60000L));
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, empPayrollDTO);
        return employeePayrollData ;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId, empPayrollDTO);
        return employeePayrollData ;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {

    }
}
