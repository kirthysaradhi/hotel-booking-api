package com.airasia.hotel.booking.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.airasia.hotel.booking.model.BookingDetails;
import com.airasia.hotel.booking.model.CustomerMaster;
import com.airasia.hotel.booking.repository.BookingDetailsRepository;
import com.airasia.hotel.booking.repository.CustomerMasterRepository;
import com.airasia.hotel.booking.service.BookingDetailsService;
import com.airasia.hotel.booking.vo.BookingDetailsVO;
import com.airasia.hotel.booking.vo.CustomerVO;

/**
 * 
 * @author Kirthy Saradhi D
 * Service Class to manage Booking/Order Related Operations
 *
 */
@Service
public class BookingDetailsServiceImpl implements BookingDetailsService {

	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;

	@Autowired
	CustomerMasterRepository customerMasterRepository;

	@Override
	public boolean save(BookingDetailsVO bookingDetailsVO) {
		boolean flag = false;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		try {
			CustomerVO customerVO = bookingDetailsVO.getCustomer();
			CustomerMaster custMaster = new CustomerMaster();
			if (customerVO != null) {
				custMaster.setCustName(customerVO.getCustName());
				custMaster.setCustEmail(customerVO.getCustEmail());
				custMaster.setCustMobile(customerVO.getCustMobile());
				custMaster.setIdentificationNo(customerVO.getCustId());
				customerMasterRepository.save(custMaster);
			} else {
				return flag;
			}

			BookingDetails bookingDetail = new BookingDetails();
			if (bookingDetailsVO.getCheckInDate() != null && !"".equals(bookingDetailsVO.getCheckInDate())) {
				bookingDetail.setCheckInDate(df.parse(bookingDetailsVO.getCheckInDate()));
			}
			if (bookingDetailsVO.getCheckInDate() != null && !"".equals(bookingDetailsVO.getCheckInDate())) {
				bookingDetail.setCheckOutDate(df.parse(bookingDetailsVO.getCheckOutDate()));
			}

			bookingDetail.setDays(1);
			bookingDetail.setTotalPrice(bookingDetailsVO.getTotalPrice());
			bookingDetail.setCustomerId(custMaster.getCustId());
			bookingDetail.setHotelId(bookingDetailsVO.getHotelId());
			bookingDetail.setRoomId(bookingDetailsVO.getRoom().getRoomId());
			bookingDetailsRepository.save(bookingDetail);
			flag = true;

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		return flag;
	}

	@Override
	public BookingDetailsVO update(long id, BookingDetailsVO bookingDetailsVO) {

		// PENDING
		return bookingDetailsVO;
	}

	@Override
	public boolean delete(long id) {
		boolean success = false;
		bookingDetailsRepository.deleteById(id);
		success = true;
		return success;
	}

	@Override
	public BookingDetailsVO get(long id) {

		BookingDetailsVO bookingDetailsVO = new BookingDetailsVO();
		// PENDING

		return bookingDetailsVO;
	}

	@Override
	public List<BookingDetailsVO> getAllBookingDetailsList() {

		List<BookingDetailsVO> bookingDetailsList = new ArrayList<BookingDetailsVO>();
		// PENDING
		return bookingDetailsList;
	}

}