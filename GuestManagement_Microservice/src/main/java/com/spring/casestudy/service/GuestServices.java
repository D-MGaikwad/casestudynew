package com.spring.casestudy.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.casestudy.model.Guest;

public interface GuestServices {
    public String addGuest(@RequestParam int guestId,@RequestParam int guestMemberCode, @RequestParam String guestName,
    		               @RequestParam String gender,@RequestParam String guestEmail,@RequestParam String guestAddress,
    		               @RequestParam String company,@RequestParam String guestPhoneNumber);

    public String updateGuest(@PathVariable int guestId,@RequestParam int guestMemberCode, @RequestParam String guestName,
    		                  @RequestParam String gender,@RequestParam String guestEmail,@RequestParam String guestAddress,
    		                  @RequestParam String company,@RequestParam String guestPhoneNumber);

    public String deleteGuest(@PathVariable int guestId);
    public List<Guest> findAllGuest();
}
