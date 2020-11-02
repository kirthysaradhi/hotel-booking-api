package com.airasia.hotel.booking.service;

import java.util.List;

import com.airasia.hotel.booking.vo.BookingDetailsVO;

/**
 * 
 * @author Kirthy Saradhi D
 *
 */
public interface BookingDetailsService {

	public boolean save(BookingDetailsVO bookingDetailsVO);

	public BookingDetailsVO update(long id, BookingDetailsVO bookingDetailsVO);

	boolean delete(long id);

	public BookingDetailsVO get(long id);

	public List<BookingDetailsVO> getAllBookingDetailsList();

}
