package com.spring.casestudy.service;

import java.util.List;
import org.slf4j.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.casestudy.exception.EmptyInputException;
import com.spring.casestudy.exception.IdNotFoundException;
import com.spring.casestudy.model.Room;
import com.spring.casestudy.repository.InventoryRepository;

@Service
public class InventoryServicesImpl implements InventoryServices{

    //Logger logger = LoggerFactory.getLogger(InventoryServicesImpl.class);

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
	public String addRoom(int roomNumber, boolean singleRoom, boolean doubleRoom,
			String roomType) {
       // logger.info("Entered Service AddStaff()");
        Room newroom = new Room();
        newroom.setRoomNumber(this.inventoryRepository.findAll().size()+1);
        newroom.setSingleRoom(singleRoom);
        newroom.setDoubleRoom(doubleRoom);
        newroom.setRoomType(roomType);
        
        this.inventoryRepository.save(newroom);
        return "Room with room number " +newroom.getRoomNumber() + " added successfully";
    }

    @Override
	public String updateRoom(int roomNumber, boolean singleRoom, boolean doubleRoom,
			String roomType) {
       // logger.info("Entered Service UpdateStaff()");
        try{
            Room updateroom = this.inventoryRepository.findByRoomNumber(roomNumber);
            
            updateroom.setRoomNumber(roomNumber);
            updateroom.setSingleRoom(singleRoom);
            updateroom.setDoubleRoom(doubleRoom);
            updateroom.setRoomType(roomType);
            
        } catch(Exception e) {
            throw new IdNotFoundException("Room not found");
        }
        return "Room with room number "+ roomNumber + " successfully updated!";
    }

	@Override
	public String deleteRoom(int roomNumber){
        //logger.info("Entered Service DeleteGuest()");
        try{
            this.inventoryRepository.deleteById(roomNumber);
        } catch(Exception e) {
            throw new IdNotFoundException("Guest not found");
        }
        return "Employee Employee-Code "+ roomNumber +" successfully deleted";
    }

    @Override
	public List<Room> findAllRoom() {
		//logger.info("Entered Service UpdateGuest()");
        List<Room> RoomList = this.inventoryRepository.findAll();
        if(RoomList.isEmpty())
              throw new EmptyInputException("Room list is empty");
        return RoomList;
	}
    
}
