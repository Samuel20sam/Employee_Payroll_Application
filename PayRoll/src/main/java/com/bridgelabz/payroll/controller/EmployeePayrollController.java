package com.bridgelabz.payroll.controller;

import com.bridgelabz.payroll.DTO.EmployeePayrollDTO;
import com.bridgelabz.payroll.DTO.ResponseDTO;
import com.bridgelabz.payroll.model.EmployeePayrollData;
import com.bridgelabz.payroll.service.EmployeePayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/EPR")
public class EmployeePayrollController {

    private final EmployeePayrollService employeePayrollService;
    public EmployeePayrollController(EmployeePayrollService employeePayrollService) {
        this.employeePayrollService = employeePayrollService;
    }

    @RequestMapping(value = {" ", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Samuel", 30000L));
        ResponseDTO responseDTO = new ResponseDTO("Success Call!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(value = {" ", "/get/{empID}"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable int empID) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(empID, new EmployeePayrollDTO("Steven", 60000L));
        ResponseDTO responseDTO = new ResponseDTO("Success Call for ID!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping(value = {" ", "/add"})
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(2, employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Data Successfully!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping(value = {" ", "/edit/{empID}"})
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable int empID,
                                                                 @RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData;
        employeePayrollData = new EmployeePayrollData(empID, employeePayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Data Updated Successfully!!!", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping(value = {" ", "/remove/{empID}"})
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable int empID) {
        ResponseDTO responseDTO = new ResponseDTO("Data Deleted Successfully!!!","Deleted ID: " + empID);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}
