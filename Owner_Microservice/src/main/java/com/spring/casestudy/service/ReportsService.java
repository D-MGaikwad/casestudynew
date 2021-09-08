package com.spring.casestudy.service;

import java.util.List;

import com.spring.casestudy.model.Guest;
import com.spring.casestudy.model.Room;
import com.spring.casestudy.model.Staff;

public interface ReportsService {

    public List<Staff> viewStaffReports();
    public List<Room> viewRoomReports();
    public List<Guest> viewGuestDetails();
   // public List<Reservation> viewReservationDetails();
}
