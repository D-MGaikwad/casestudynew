package com.spring.casestudy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.casestudy.model.Guest;

public interface GuestRepository extends MongoRepository<Guest, Integer> {

	Guest findByGuestId(int guestId);

}
