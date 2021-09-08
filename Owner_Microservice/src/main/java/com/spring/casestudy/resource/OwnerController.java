package com.spring.casestudy.resource;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.casestudy.model.Department;
import com.spring.casestudy.model.Guest;
import com.spring.casestudy.model.Room;
import com.spring.casestudy.model.Staff;
import com.spring.casestudy.repository.DepartmentRepository;
import com.spring.casestudy.service.DepartmentService;
import com.spring.casestudy.service.ReportsService;


@RestController
//@CrossOrigin(origins = "*") 
//@RequestMapping("/guest")
public class OwnerController {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private DepartmentService departmentService;

	@Autowired
	private ReportsService reportsService;
	
	@PostMapping("/addDepartment")
    public String saveGuest(@RequestBody Department department) {
	departmentRepository.save(department);
	return department.getDepartmentName()+" department is added.";
	}
	
	@GetMapping("/findAllDepartment")
	public List<Department> getDepartments(){
		return departmentRepository.findAll();
	}
	
	@GetMapping("/findAllDepartment/{departmentId}")
	public Optional<Department> getDepartment(@PathVariable int departmentId){
		return departmentRepository.findById(departmentId);
	}
	
	@PutMapping("/updateDepartment/{departmentId}")
    public String updateDepartment(@RequestBody Department departmentId){
		departmentRepository.save(departmentId);
		return departmentId.getDepartmentName()+ " Department is updated";
    }
	
	@DeleteMapping("/delete/{departmentId}")
	public String deleteDepartment(@PathVariable int departmentId) {
		departmentRepository.deleteById(departmentId);
		return "Department with id '"+departmentId+ "' is successfully deleted.";
	}
	
     /*===================view-reports======================*/
	
	 @GetMapping("/view-departments")
	    public List<Department> viewDepartments() {
	       // logger.info("Entered viewDepartments()");
	        return this.departmentService.viewDepartments();
	    }

	    @GetMapping("/view-staff-reports")
	    public List<Staff> viewStaffReports() {
	       // logger.info("Entered viewStaffReports()");
	        return this.reportsService.viewStaffReports();
	    }

	    @GetMapping("/view-room-details")
	    public List<Room> viewRoomDetails() {
	        //logger.info("Entered viewRoomDetails()");
	        return this.reportsService.viewRoomReports();
	    }

	    @GetMapping("/view-guest-details")
	    public List<Guest> viewGuestDetails() {
	       // logger.info("Entered viewGuestDetails()");
	        return this.reportsService.viewGuestDetails();
	    }

}
