package com.airasia.hotel.booking.vo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test {
 
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		String checkInDate = "10/11/2020";
		String checkOutDate = "15/11/2020";
		System.out.println(calculateDays(formatter.format(checkInDate),formatter.format(checkOutDate)));
	}
	
	public static int calculateDays(String checkinDate, String checkoutDate) {

		long daysBetween = ChronoUnit.DAYS.between(LocalDate.parse(checkinDate), LocalDate.parse(checkoutDate));

		return (int) daysBetween;
	}
}
