package com.spring.casestudy.service;

import java.util.List;

import com.spring.casestudy.model.Department;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface DepartmentService {

   public String addDepartment(@RequestParam int departmentId, @RequestParam String departmentName, @RequestParam int numberOfStaff);
   
   public String updateDepartment(@PathVariable int departmentId, @RequestParam String departmentName, @RequestParam int numberOfStaff);
   
   public String deleteDepartment(@PathVariable int departmentId);
    public List<Department> viewDepartments();
    
}
