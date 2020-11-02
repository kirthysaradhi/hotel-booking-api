package com.airasia.hotel.booking.vo;

import javax.validation.constraints.NotEmpty;

/**
 * 
 * @author Kirthy Saradhi D
 *
 */
public class CustomerVO {

	@NotEmpty(message = "Customer Name is Mandatory")
	private String custName;

	@NotEmpty(message = "Customer Email-Id is Mandatory")
	private String custEmail;

	@NotEmpty(message = "Customer Mobile Number is Mandatory)")
	private Integer custMobile;

	//@NotEmpty(message = "Customer Id is Mandatory(Provide either IC or Passport Number)")
	private String custId;

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

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}
}
