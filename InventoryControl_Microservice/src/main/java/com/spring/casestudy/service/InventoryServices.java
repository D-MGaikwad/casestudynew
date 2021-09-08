package com.spring.casestudy.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.casestudy.model.Room;

public interface InventoryServices {
    public String addRoom(@RequestParam int roomNumber,@RequestParam boolean singleRoom,
    		               @RequestParam boolean doubleRoom,@RequestParam String roomType);

    public String updateRoom(@PathVariable int roomNumber,@RequestParam boolean singleRoom,
                              @RequestParam boolean doubleRoom,@RequestParam String roomType);

    public String deleteRoom(@PathVariable int employeeCode);
    public List<Room> findAllRoom();
}
