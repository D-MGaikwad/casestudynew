package com.spring.casestudy.service;

import java.util.List;
import org.slf4j.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.casestudy.exception.EmptyInputException;
import com.spring.casestudy.exception.IdNotFoundException;
import com.spring.casestudy.model.Guest;
import com.spring.casestudy.repository.GuestRepository;

@Service
public class GuestServicesImpl implements GuestServices{

    Logger logger = LoggerFactory.getLogger(GuestServicesImpl.class);

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public String addGuest(int guestId,int guestMemberCode, String guestName,String gender,
    		String guestEmail,String guestAddress,String company, String guestPhoneNumber  
            ) {
        logger.info("Entered Service AddGuest()");
        Guest newguest = new Guest();
        newguest.setGuestId(this.guestRepository.findAll().size()+1);
        newguest.setGuestMemberCode(guestMemberCode);
        newguest.setGuestName(guestName);
        newguest.setGender(gender);
        newguest.setGuestEmail(guestEmail);
        newguest.setGuestAddress(guestAddress);
        newguest.setCompany(company);
        newguest.setGuestPhoneNumber(guestPhoneNumber);
       
       
        
        this.guestRepository.save(newguest);
        return "Guest with id " +newguest.getGuestId() + " added successfully";
    }

    @Override
    public String updateGuest(int guestId,int guestMemberCode, String guestName,String gender,
    		String guestEmail,String guestAddress,String company, String guestPhoneNumber  
            ) {
        logger.info("Entered Service UpdateGuest()");
        try{
            Guest updateGuest = this.guestRepository.findByGuestId(guestId);
            updateGuest.setGuestMemberCode(guestMemberCode);
            updateGuest.setGuestName(guestName);
            updateGuest.setGender(gender);
            updateGuest.setGuestEmail(guestEmail);
            updateGuest.setGuestAddress(guestAddress);
            updateGuest.setCompany(company);
            updateGuest.setGuestPhoneNumber(guestPhoneNumber);
            
            
            
            this.guestRepository.save(updateGuest);
        } catch(Exception e) {
            throw new IdNotFoundException("Department Id not found");
        }
        return "Guest with id "+ guestId + " successfully updated!";
    }

    @Override
    public String deleteGuest(int guestId) {
        logger.info("Entered Service DeleteGuest()");
        try{
            this.guestRepository.deleteById(guestId);
        } catch(Exception e) {
            throw new IdNotFoundException("Guest not found");
        }
        return "GuestId "+ guestId +" successfully deleted";
    }

	@Override
	public List<Guest> findAllGuest() {
		logger.info("Entered Service UpdateGuest()");
        List<Guest> guestList = this.guestRepository.findAll();
        if(guestList.isEmpty())
              throw new EmptyInputException("Staff list is empty");
        return guestList;
	}

    
}
