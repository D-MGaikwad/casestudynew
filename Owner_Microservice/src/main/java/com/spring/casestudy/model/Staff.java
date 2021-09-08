package com.spring.casestudy.model;

import org.springframework.data.annotation.Id;

public class Staff {
	
	@Id
	private int employeeCode;
	private String employeeName;
	private String employeeAddress;
	private int salary;
	private int nic;
	private int age;
	private String occupation;
	private String employeeEmail;
	
	public int getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getNic() {
		return nic;
	}
	public void setNic(int nic) {
		this.nic = nic;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	@Override
	public String toString() {
		return "Staffs [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", salary=" + salary + ", nic=" + nic + ", age=" + age + ", occupation="
				+ occupation + ", employeeEmail=" + employeeEmail + "]";
	}
	    
		

}
