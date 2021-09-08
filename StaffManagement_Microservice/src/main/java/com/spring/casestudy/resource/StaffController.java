package com.spring.casestudy.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.casestudy.model.Staff;
import com.spring.casestudy.repository.StaffRepository;


@RestController
@CrossOrigin(origins = "*") 
//@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	private StaffRepository repository;
	
	@PostMapping("/addStaff")
    public String saveEmployee(@RequestBody Staff employee) {
	repository.save(employee);
	return "Added Staff with id: "+employee.getEmployeeCode();
	}
	
	@GetMapping("/findAllStaff")
	public List<Staff> getEmployees(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllStaff/{employeeCode}")
	public Optional<Staff> getEmployee(@PathVariable int employeeCode){
		return repository.findById(employeeCode);
	}
	
	@PutMapping("/updateStaff/{employeeCode}")
    public String updateStaff(@RequestBody Staff employee){
		repository.save(employee);
		return "Updated Staff for id: "+employee.getEmployeeCode();
    }
	
	
	@DeleteMapping("/delete/{employeeCode}")
	public String deleteEmployee(@PathVariable int employeeCode) {
		repository.deleteById(employeeCode);
		return "Staff deleted with id: "+employeeCode;
	}
	
}
