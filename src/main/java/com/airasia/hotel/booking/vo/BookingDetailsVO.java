package com.airasia.hotel.booking.vo;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Kirthy Saradhi D
 *
 */
public class BookingDetailsVO implements Serializable {

	@NotNull(message = "Hotel ID is Mandatory")
	private int hotelId;

	@NotNull(message = "Hotel Name is Mandatory")
	private String hotelName;

	private static final long serialVersionUID = 1L;

	private int bookingId;

	@NotNull(message = "Checkin Date is Mandatory")
	private String checkInDate;

	@NotNull(message = "Checkout Date is Mandatory")
	private String checkOutDate;

	private int days;

	private Float totalPrice;

	private CustomerVO customer;

	private HotelRoomVO room;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public CustomerVO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerVO customer) {
		this.customer = customer;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public HotelRoomVO getRoom() {
		return room;
	}

	public void setRoom(HotelRoomVO room) {
		this.room = room;
	}

}