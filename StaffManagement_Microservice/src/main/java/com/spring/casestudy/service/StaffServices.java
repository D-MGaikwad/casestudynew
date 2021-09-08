package com.spring.casestudy.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.casestudy.model.Staff;

public interface StaffServices {
    public String addStaff(@RequestParam int employeeCode,@RequestParam String employeeName,
    		               @RequestParam String employeeAddress,@RequestParam int salary,
    		               @RequestParam int nic,@RequestParam int age,
    		               @RequestParam String occupation,@RequestParam String employeeEmail);

    public String updateStaff(@PathVariable int employeeCode,@RequestParam String employeeName,
                              @RequestParam String employeeAddress,@RequestParam int salary,
                              @RequestParam int nic,@RequestParam int age,
                              @RequestParam String occupation,@RequestParam String employeeEmail);

    public String deleteStaff(@PathVariable int employeeCode);
    public List<Staff> findAllStaff();
}
