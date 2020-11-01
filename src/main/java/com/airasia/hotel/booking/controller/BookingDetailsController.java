package com.airasia.hotel.booking.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airasia.hotel.booking.exception.ResourceNotFoundException;
import com.airasia.hotel.booking.service.BookingDetailsService;
import com.airasia.hotel.booking.vo.BookingDetailsVO;;

/**
 * 
 * @author Kirthy Saradhi D
 *
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BookingDetailsController {

	@Autowired
	private BookingDetailsService bookingDetailsService;

	@GetMapping("/bookingdetails")
	public List<BookingDetailsVO> getAllBookingDetailsList() {

		return bookingDetailsService.getAllBookingDetailsList();
	}

	@GetMapping("/bookingdetails/{id}")
	public ResponseEntity<BookingDetailsVO> getBookingDetailsVOById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		BookingDetailsVO BookingDetailsVO = bookingDetailsService.get(id);
		return ResponseEntity.ok().body(BookingDetailsVO);
	}

	@PostMapping("/bookingdetails")
	public ResponseEntity<String> createBookingDetailsVO(@Valid @RequestBody BookingDetailsVO bookingDetailsVO) {
		//return ResponseEntity.ok().body(bookingDetailsService.save(bookingDetailsVO));
		if(!bookingDetailsService.save(bookingDetailsVO)) {
	        return new ResponseEntity<>(
	          "Year of birth cannot be in the future", 
	          HttpStatus.BAD_REQUEST);
	    } else {
	 
	    return new ResponseEntity<>(
	      "SUCCESS" , 
	      HttpStatus.OK);
	    }
	}

	@PutMapping("/bookingdetails/{id}")
	public ResponseEntity<BookingDetailsVO> updateBookingDetails(@PathVariable(value = "id") Long id,
			@Valid @RequestBody BookingDetailsVO bookingDetailsVO) throws ResourceNotFoundException {
		BookingDetailsVO updateBookingDetailsVO = null;
		if (bookingDetailsVO.getCheckInDate() != null) {
			updateBookingDetailsVO = bookingDetailsService.update(id, bookingDetailsVO);
		}

		return ResponseEntity.ok(updateBookingDetailsVO);
	}

	@DeleteMapping("/bookingdetails/{id}")
	public Map<String, Boolean> deleteBookingDetailsById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {

		boolean success = bookingDetailsService.delete(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", success);
		return response;
	}
}
