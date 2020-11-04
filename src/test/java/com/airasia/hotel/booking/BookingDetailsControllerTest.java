package com.airasia.hotel.booking;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import com.airasia.hotel.booking.controller.BookingDetailsController;
import com.airasia.hotel.booking.service.BookingDetailsService;
import com.airasia.hotel.booking.vo.BookingDetailsVO;
import io.micrometer.core.instrument.util.IOUtils;

/**
 * 
 * @author Kirthy Saradhi D
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(BookingDetailsController.class)
public class BookingDetailsControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private BookingDetailsService bookingDetailsService;

	@Before
	public void init() {
	}

	@Test
	public void createOrderSuccessMock() throws Exception {
		try {
			String validCreateOrder = IOUtils
					.toString(this.getClass().getResourceAsStream("/json/ValidCreateOrderRequest.json"));
			// BookingDetailsVO bd = new ObjectMapper().readValue(validCreateOrder,
			// BookingDetailsVO.class);

			Mockito.when(bookingDetailsService.save(any(BookingDetailsVO.class))).thenReturn(true);
			mockMvc.perform(post("/api/v1/createOrder").contentType("application/json").content(validCreateOrder))
					.andExpect(status().isOk()).andDo(MockMvcResultHandlers.log());

		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	@Test
	public void createOrderFailureMock() throws Exception {
		try {
			String validCreateOrder = IOUtils
					.toString(this.getClass().getResourceAsStream("/json/ValidCreateOrderRequest.json"));

			Mockito.when(bookingDetailsService.save(any(BookingDetailsVO.class))).thenReturn(false);
			mockMvc.perform(post("/api/v1/createOrder").contentType("application/json").content(validCreateOrder))
					.andExpect(status().isOk()).andDo(MockMvcResultHandlers.log());

		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	/*
	 * @Test public void createOrderInvalidHotelId() throws Exception { try { String
	 * invalidHotelIdRequest = IOUtils
	 * .toString(this.getClass().getResourceAsStream(
	 * "/json/InvalidHotelIdRequest.json"));
	 * Mockito.when(bookingDetailsService.save(any(BookingDetailsVO.class))).
	 * thenReturn(true);
	 * mockMvc.perform(post("/api/v1/createOrder").contentType("application/json").
	 * content(invalidHotelIdRequest))
	 * .andExpect(status().isBadRequest()).andDo(MockMvcResultHandlers.log());
	 * 
	 * } catch (Exception ex) { ex.printStackTrace(); throw ex; } }
	 */

}
