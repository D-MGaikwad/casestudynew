package com.spring.casestudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "departments")
public class Department {
    
	@Id
	private int departmentId;
	private String departmentName;
	private int numberOfStaff;
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNumberOfStaff() {
		return numberOfStaff;
	}
	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}
	@Override
	public String toString() {
		return "Guest [departmentId=" + departmentId + ", departmentName=" + departmentName + ", numberOfStaff="
				+ numberOfStaff + "]";
	}
	
}
