package com.airasia.hotel.booking.service;

import java.util.List;

import com.airasia.hotel.booking.vo.BookingDetailsVO;

public interface BookingDetailsService {

	public boolean save(BookingDetailsVO bookingDetailsVO);
   
	BookingDetailsVO update(long id, BookingDetailsVO bookingDetailsVO);
   
	boolean delete(long id);

	BookingDetailsVO get(long id);

	public List<BookingDetailsVO> getAllBookingDetailsList();

}
