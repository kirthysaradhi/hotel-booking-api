
package com.airasia.hotel.booking.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.airasia.hotel.booking.vo.BookingDetailsVO;

@Component
public class BookingValidator implements Validator {

	@Override
	public boolean supports(Class<?> aClass) {
		return BookingDetailsVO.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		BookingDetailsVO bookingDetailsVO = (BookingDetailsVO) o;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "custName", "NotEmpty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "custEmail", "NotEmpty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "custMobile", "NotEmpty");
		
	}
}
