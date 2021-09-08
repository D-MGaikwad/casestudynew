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

import com.spring.casestudy.model.Room;
import com.spring.casestudy.repository.InventoryRepository;


@RestController
//@CrossOrigin(origins = "*") 
public class InventoryController {
	
	@Autowired
	private InventoryRepository repository;
	
	@PostMapping("/addRoom")
    public String saveEmployee(@RequestBody Room room) {
	repository.save(room);
	return "Added room with Room number: "+room.getRoomNumber();
	}
	
	@GetMapping("/findAllRoom")
	public List<Room> getRooms(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllRoom/{roomNumber}")
	public Optional<Room> getRoom(@PathVariable int roomNumber){
		return repository.findById(roomNumber);
	}
	
	@PutMapping("/updateRoom/{roomNumber}")
    public String updateRoom(@RequestBody Room roomNumber){
		repository.save(roomNumber);
		return "Updated Room information for Room number: "+roomNumber.getRoomNumber();
    }
		
	@DeleteMapping("/delete/{roomNumber}")
	public String deleteEmployee(@PathVariable int roomNumber) {
		repository.deleteById(roomNumber);
		return "Room deleted with Room Number: "+roomNumber;
	}
	
}
