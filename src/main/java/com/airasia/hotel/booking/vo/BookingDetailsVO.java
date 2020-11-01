package com.airasia.hotel.booking.vo;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

public class BookingDetailsVO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer bookingId;

    @NotBlank(message = "Checkin Date is Mandatory")
    private String checkInDate;
    

    @NotBlank(message = "Checkout Date is Mandatory")
    private String checkOutDate;
    
    private Integer days;
    
    private Float totalPrice;
    
    //Customer Info
    private String custName;
    
    private String custEmail;
    
    private Integer custMobile;
    
    private String identificationNo;
    
    private Integer hotelId;
    
    private Integer roomId;

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
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

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public Integer getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(Integer custMobile) {
		this.custMobile = custMobile;
	}

	public String getIdentificationNo() {
		return identificationNo;
	}

	public void setIdentificationNo(String identificationNo) {
		this.identificationNo = identificationNo;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
    
}