package com.airasia.hotel.booking;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.airasia.hotel.booking.model.BookingDetails;
import com.airasia.hotel.booking.model.CustomerMaster;
import com.airasia.hotel.booking.repository.BookingDetailsRepository;
import com.airasia.hotel.booking.repository.CustomerMasterRepository;
import com.airasia.hotel.booking.service.BookingDetailsService;
import com.airasia.hotel.booking.service.impl.BookingDetailsServiceImpl;
import com.airasia.hotel.booking.vo.BookingDetailsVO;
import com.airasia.hotel.booking.vo.CustomerVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micrometer.core.instrument.util.IOUtils;

/**
 * 
 * @author Kirthy Saradhi D
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class BookingDetailsServiceImplTest {

	@MockBean
	private BookingDetailsService bookingDetailsService;

	@Mock
	private CustomerMasterRepository customerMasterRepository;
	
	@Mock
	private BookingDetailsRepository bookingDetailsRepository;

	@InjectMocks
	private BookingDetailsServiceImpl bookingDetailsServiceImpl = new BookingDetailsServiceImpl();

	@Before
	public void init() {

	}

	@Test
	public void createOrderMock() throws Exception {
		try {
			String validCreateOrder = IOUtils
					.toString(this.getClass().getResourceAsStream("/json/ValidCreateOrderRequest.json"));
			BookingDetailsVO bd = new ObjectMapper().readValue(validCreateOrder, BookingDetailsVO.class);
			CustomerMaster cm = constructCustomerMaster(bd.getCustomer());
			//Mockito.when(customerMasterRepository.save(cm)).thenReturn(cm);
			BookingDetails booking = constructBookingDetails(bd);
			//Mockito.when(bookingDetailsRepository.save(booking)).thenReturn(booking);
			// Mockito.when(bookingDetailsService.save(any(BookingDetailsVO.class))).thenReturn(true);
			bookingDetailsServiceImpl.save(bd);
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	public CustomerMaster constructCustomerMaster(CustomerVO customerVO) {
		CustomerMaster custMaster = new CustomerMaster();
		custMaster.setCustName(customerVO.getCustName());
		custMaster.setCustEmail(customerVO.getCustEmail());
		custMaster.setCustMobile(customerVO.getCustMobile());
		custMaster.setIdentificationNo(customerVO.getCustId());

		return custMaster;
	}

	public BookingDetails constructBookingDetails(BookingDetailsVO bookingDetailsVO) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		BookingDetails bookingDetail = new BookingDetails();
		try {
			bookingDetail.setCheckInDate(df.parse(bookingDetailsVO.getCheckInDate()));
			bookingDetail.setCheckOutDate(df.parse(bookingDetailsVO.getCheckOutDate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		bookingDetail.setDays(1);
		bookingDetail.setTotalPrice(bookingDetailsVO.getTotalPrice());
		bookingDetail.setCustomerId(223456);
		bookingDetail.setHotelId(bookingDetailsVO.getHotelId());
		bookingDetail.setRoomId(bookingDetailsVO.getRoom().getRoomId());

		return bookingDetail;
	}
}
