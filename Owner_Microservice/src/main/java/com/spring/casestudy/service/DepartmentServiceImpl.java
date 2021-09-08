package com.spring.casestudy.service;

import java.util.List;
import org.slf4j.*;

import com.spring.casestudy.exception.EmptyInputException;
import com.spring.casestudy.exception.IdNotFoundException;
import com.spring.casestudy.model.Department;
import com.spring.casestudy.repository.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public String addDepartment(int departmentId, String departmentName, int numberOfStaff) {
                logger.info("Entered Service addDepartment()");

                Department department = new Department();
                department.setDepartmentId(departmentId);
                department.setDepartmentName(departmentName);
                department.setNumberOfStaff(departmentId);
                this.departmentRepository.save(department);
                return "Deparment " + departmentName + " added successfully !";
    }

    
	@Override
    public String updateDepartment(int departmentId, String departmentName, int numberOfStaff) {
                logger.info("Entered Service updateDepartment()");
                try{
                    Department department = this.departmentRepository.findByDepartmentId(departmentId);
                    department.setDepartmentName(departmentName);
                    department.setNumberOfStaff(numberOfStaff);
                    this.departmentRepository.save(department);
                } catch(Exception e) {
                    throw new IdNotFoundException("Department Id not found");
                }
                return "Deparment updated successfully for "+departmentId +"!";
    }

    @Override
    public String deleteDepartment(int departmentId) {
        logger.info("Entered Service deleteDepartment()");
        try{
            this.departmentRepository.deleteById(departmentId);
        } catch(Exception e) {
            throw new IdNotFoundException("Staff not found");
        }
        return "Deparment is deleted for "+departmentId;
    }

    @Override
    public List<Department> viewDepartments() {
        logger.info("Entered Service viewDepartments()");
        List<Department> deptList = departmentRepository.findAll();
        if(deptList.isEmpty())
              throw new EmptyInputException("Department list is empty");
        return deptList;
    }
    
}
