package com.spring.casestudy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.casestudy.model.Room;

public interface InventoryRepository extends MongoRepository<Room, Integer> {

	Room findByRoomNumber(int roomNumber);

}
