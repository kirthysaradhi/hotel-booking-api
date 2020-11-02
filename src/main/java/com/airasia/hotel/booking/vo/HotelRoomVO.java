package com.airasia.hotel.booking.vo;

import javax.validation.constraints.NotNull;

/**
 * 
 * @author Kirthy Saradhi D
 *
 */
public class HotelRoomVO {

	@NotNull(message = "Room ID is Mandatory")
	private int roomId;

	@NotNull(message = "Room Name is Mandatory")
	private String roomName;

	@NotNull(message = "Guest Count is Mandatory")
	private int guestCount;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getGuestCount() {
		return guestCount;
	}

	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}

}
