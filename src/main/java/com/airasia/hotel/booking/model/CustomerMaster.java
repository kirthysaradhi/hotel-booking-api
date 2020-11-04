package com.airasia.hotel.booking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Kirthy Saradhi D
 * Entity class for CUSTOMER_MASTER table
 *
 */
@Entity
@Table(name = "CUSTOMER_MASTER")
public class CustomerMaster implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUST_ID")
    private Integer custId;

    @Column(name = "CUST_NAME")
    private String custName;
    
    @Column(name = "CUST_EMAIL")
    private String custEmail;
    
    @Column(name = "CUST_MOBILE")
    private Integer custMobile;
    
    @Column(name = "IDENTIFICATION_NO")
    private String identificationNo;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
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

}