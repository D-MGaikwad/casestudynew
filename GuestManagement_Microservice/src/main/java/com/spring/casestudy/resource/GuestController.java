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

import com.spring.casestudy.model.Guest;
import com.spring.casestudy.repository.GuestRepository;


@RestController
@CrossOrigin(origins = "*") 
//@RequestMapping("/guest")
public class GuestController {
	
	@Autowired
	private GuestRepository repository;
	
	@PostMapping("/addGuest")
    public String saveGuest(@RequestBody Guest guest) {
	repository.save(guest);
	return "Added Guest with id: "+guest.getGuestId();
	}
	
	@GetMapping("/findAllGuest")
	public List<Guest> getGuests(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllGuest/{guestId}")
	public Optional<Guest> getGuest(@PathVariable int guestId){
		return repository.findById(guestId);
	}
	
	@PutMapping("/updateGuest/{guestId}")
    public String updateGuest(@RequestBody Guest guest){
		repository.save(guest);
		return "Updated Guest for id: "+guest.getGuestId();
    }
	
	
	@DeleteMapping("/delete/{guestId}")
	public String deleteGuest(@PathVariable int guestId) {
		repository.deleteById(guestId);
		return "Guest deleted with id: "+guestId;
	}
	
}
