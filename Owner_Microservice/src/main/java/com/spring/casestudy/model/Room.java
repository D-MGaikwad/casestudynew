package com.spring.casestudy.model;

import org.springframework.data.annotation.Id;

public class Room {
	
	@Id
	private int roomNumber;
	private boolean singleRoom;
	private boolean doubleRoom;
	private String roomType;
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public boolean isSingleRoom() {
		return singleRoom;
	}
	public void setSingleRoom(boolean singleRoom) {
		this.singleRoom = singleRoom;
	}
	public boolean isDoubleRoom() {
		return doubleRoom;
	}
	public void setDoubleRoom(boolean doubleRoom) {
		this.doubleRoom = doubleRoom;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", singleRoom=" + singleRoom + ", doubleRoom=" + doubleRoom
				+ ", roomType=" + roomType + "]";
	}
	    
		

}
