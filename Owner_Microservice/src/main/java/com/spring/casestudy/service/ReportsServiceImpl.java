package com.spring.casestudy.service;

import java.util.*;
import org.slf4j.*;

import com.spring.casestudy.model.Guest;
import com.spring.casestudy.model.Room;
import com.spring.casestudy.model.Staff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ReportsServiceImpl implements ReportsService {

   // Logger logger = LoggerFactory.getLogger(ReportsServiceImpl.class);

    @Autowired
    private RestTemplate restTemplate;    
    
    @Override
    public List<Staff> viewStaffReports() {
      //  logger.info("Entered Service viewStaffReports()");
        //List<staff> newStaff = new ArrayList<>();
    	var staff1 = this.restTemplate.getForObject("http://Staff-Management-service/view-staff-reports" ,List.class);
        //var s = staff1.getStaffReport().stream().collect(Collectors.toList());
        
        System.out.println(staff1);
        return staff1;

    }

    @Override
    public List<Room> viewRoomReports() {
       // logger.info("Entered Service viewRoomDetails()");
        var room1 = this.restTemplate.getForObject("http://Room-Management-service/findAllRoom" ,List.class);
        return room1;
    }

    @Override
    public List<Guest> viewGuestDetails() {
       // logger.info("Entered Service viewGuestDetails()");
        var guest1 = this.restTemplate.getForObject("http://Guest-Management-service/findAllGuest" ,List.class);
        return guest1;
    }

//    @Override
//    public List<Reservation> viewReservationDetails() {
//        logger.info("Entered Service viewvDetails()");
//        var reservation1 = this.restTemplate.getForObject("http://RESERVATION-SERVICE/receptionist/viewall-reservations" ,List.class);
//        return reservation1;
//    }
//    
}
