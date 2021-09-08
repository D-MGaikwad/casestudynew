package com.spring.casestudy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.casestudy.model.Staff;

public interface StaffRepository extends MongoRepository<Staff, Integer> {

	Staff findByEmployeeCode(int employeeCode);

}
