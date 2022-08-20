package com.bridgelabz.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PayRollApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll application");
        SpringApplication.run(PayRollApplication.class, args);
    }

}
