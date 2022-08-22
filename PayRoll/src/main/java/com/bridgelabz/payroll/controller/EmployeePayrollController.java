package com.bridgelabz.payroll.controller;

import com.bridgelabz.payroll.DTO.EmployeePayrollDTO;
import com.bridgelabz.payroll.DTO.ResponseDTO;
import com.bridgelabz.payroll.model.EmployeePayrollData;
import com.bridgelabz.payroll.service.EmployeePayrollServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/EmployeePayroll")
public class EmployeePayrollController {

    private final EmployeePayrollServiceImpl employeePayrollService;

    public EmployeePayrollController(EmployeePayrollServiceImpl employeePayrollService) {
        this.employeePayrollService = employeePayrollService;
    }

    @RequestMapping(value = {"/get"},method = RequestMethod.GET)
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List<EmployeePayrollData> employeePayrollDataList = employeePayrollService.getEmployeePayrollData();
        ResponseDTO respDTO = new ResponseDTO("Get Call is Successful", employeePayrollDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData employeePayrollData = employeePayrollService.getEmployeePayrollDataById(empId);
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID is Successful", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@Valid @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = employeePayrollService.createEmployeePayrollData(empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created employee Payroll data successfully", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@Valid @PathVariable("empId") int empId,
                                                                 @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = employeePayrollService.updateEmployeePayrollData(empId, empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated employee Payroll data successfully", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        employeePayrollService.deleteEmployeePayrollData(empId);
        ResponseDTO respDTO = new ResponseDTO("Deleted successfully", "Deleted id: " + empId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
