package com.airasia.hotel.booking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROOM_MASTER")
public class RoomMaster implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_ID")
    private Integer roomId;

    @Column(name = "ROOM_NAME")
    private String roomName;
    
    @Column(name = "ROOM_CAPACITY")
    private Integer roomCapacity;
    
    @Column(name = "ROOM_PRICE")
    private Float roomPrice;

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Integer getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public Float getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Float roomPrice) {
		this.roomPrice = roomPrice;
	}
    
}