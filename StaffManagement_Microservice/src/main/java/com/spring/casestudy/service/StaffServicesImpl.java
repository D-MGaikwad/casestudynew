package com.spring.casestudy.service;

import java.util.List;
import org.slf4j.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.casestudy.exception.EmptyInputException;
import com.spring.casestudy.exception.IdNotFoundException;
import com.spring.casestudy.model.Staff;
import com.spring.casestudy.repository.StaffRepository;

@Service
public class StaffServicesImpl implements StaffServices{

    Logger logger = LoggerFactory.getLogger(StaffServicesImpl.class);

    @Autowired
    private StaffRepository staffRepository;

    @Override
	public String addStaff(int employeeCode, String employeeName, String employeeAddress,
			int salary, int nic, int age, String occupation, String employeeEmail) {
        logger.info("Entered Service AddStaff()");
        Staff newstaff = new Staff();
        newstaff.setEmployeeCode(this.staffRepository.findAll().size()+1);
        newstaff.setEmployeeName(employeeName);
        newstaff.setEmployeeAddress(employeeAddress);
        newstaff.setSalary(salary);
        newstaff.setNic(nic);
        newstaff.setAge(age);
        newstaff.setOccupation(occupation);
        newstaff.setEmployeeEmail(employeeEmail);
         
        this.staffRepository.save(newstaff);
        return "Staff with id " +newstaff.getEmployeeCode() + " added successfully";
    }

    @Override
	public String updateStaff(int employeeCode, String employeeName, String employeeAddress,
			int salary, int nic, int age, String occupation, String employeeEmail) {
        logger.info("Entered Service UpdateStaff()");
        try{
            Staff updateStaff = this.staffRepository.findByEmployeeCode(employeeCode);
            
            updateStaff.setEmployeeCode(employeeCode);
            updateStaff.setEmployeeName(employeeName);
            updateStaff.setEmployeeAddress(employeeAddress);
            updateStaff.setSalary(salary);
            updateStaff.setNic(nic);
            updateStaff.setAge(age);
            updateStaff.setOccupation(occupation);
            updateStaff.setEmployeeEmail(employeeEmail);
            
            this.staffRepository.save(updateStaff);
        } catch(Exception e) {
            throw new IdNotFoundException("Department Id not found");
        }
        return "Employee with id "+ employeeCode + " successfully updated!";
    }

    @Override
	public String deleteStaff(int employeeCode){
        logger.info("Entered Service DeleteGuest()");
        try{
            this.staffRepository.deleteById(employeeCode);
        } catch(Exception e) {
            throw new IdNotFoundException("Guest not found");
        }
        return "Employee Employee-Code "+ employeeCode +" successfully deleted";
    }

    @Override
	public List<Staff> findAllStaff() {
		logger.info("Entered Service UpdateGuest()");
        List<Staff> staffList = this.staffRepository.findAll();
        if(staffList.isEmpty())
              throw new EmptyInputException("Staff list is empty");
        return staffList;
	}
    
}
