package com.spring.casestudy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.casestudy.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, Integer> {

	Department findByDepartmentId(int departmentId);
    
	//Department deleteByDepartmentId(int departmentId);
    
	
}
