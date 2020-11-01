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
    		CustomerMaster custMaster = new CustomerMaster();
        	custMaster.setCustName(bookingDetailsVO.getCustName());
        	custMaster.setCustEmail(bookingDetailsVO.getCustEmail());
        	custMaster.setCustMobile(bookingDetailsVO.getCustMobile());
        	custMaster.setIdentificationNo(bookingDetailsVO.getIdentificationNo());
        	customerMasterRepository.save(custMaster);
        	
        	BookingDetails bookingDetail = new BookingDetails();
        	if(bookingDetailsVO.getCheckInDate()!=null && !"".equals(bookingDetailsVO.getCheckInDate())) {
        		bookingDetail.setCheckInDate(df.parse(bookingDetailsVO.getCheckInDate()));
        	}
        	if(bookingDetailsVO.getCheckInDate()!=null && !"".equals(bookingDetailsVO.getCheckInDate())) {
        		bookingDetail.setCheckOutDate(df.parse(bookingDetailsVO.getCheckOutDate()));
        	}
        	
			/*
			 * LocalDate dateBefore = LocalDate.parse(dateBeforeString); LocalDate dateAfter
			 * = LocalDate.parse(dateAfterString); ChronoUnit.DAYS.between int days =
			 * ChronoUnit.DAYS.between(dateBefore,
			 * LocalDate.parse(bookingDetail.getCheckInDate()));
			 */
        	bookingDetail.setDays(1);
        	bookingDetail.setTotalPrice(10.0f);
        	bookingDetail.setCustomerId(custMaster.getCustId());
        	bookingDetail.setHotelId(bookingDetailsVO.getHotelId());
        	bookingDetail.setRoomId(bookingDetailsVO.getRoomId());
        	bookingDetailsRepository.save(bookingDetail);
        	flag = true;
        	
    	}catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    	return flag;
	}
    

	@Override
	public BookingDetailsVO update(long id, BookingDetailsVO bookingDetailsVO) {
	
		/*
		 * UserRoles userRoles = userRepository.findUserRolesById(id); if(userRoles
		 * !=null && userRolesVO !=null) {
		 * userRoles.setUser_id(userRolesVO.getUser_id());
		 * userRoles.setUser_name(userRolesVO.getUser_name());
		 * userRoles.setPassword(userRolesVO.getPassword());
		 * userRoles.setUser_email(userRolesVO.getUser_email());
		 * userRoles.setDepartment(userRolesVO.getDepartment());
		 * userRoles.setTeam_name(userRolesVO.getTeam_name());
		 * userRoles.setUser_objects(userRolesVO.getUser_objects());
		 * if(userRolesVO.getRole_id()!=null && userRolesVO.getRole_id()>0) {
		 * RolePermissions rolePermissions = new RolePermissions();
		 * rolePermissions.setRole_id(userRolesVO.getRole_id());
		 * userRoles.setRolePermissions(rolePermissions); }
		 * userRepository.saveAndFlush(userRoles); } userRolesVO.setId(id);
		 */
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
		/*
		 * UserRoles userRoles = userRepository.findUserRolesById(id); BookingDetailsVO
		 * bookingDetailsVO = new BookingDetailsVO(); if(userRoles!=null) {
		 * userRolesVO.setUser_id(userRoles.getUser_id());
		 * userRolesVO.setUser_name(userRoles.getUser_name());
		 * userRolesVO.setPassword(userRoles.getPassword());
		 * userRolesVO.setUser_email(userRoles.getUser_email());
		 * userRolesVO.setDepartment(userRoles.getDepartment());
		 * userRolesVO.setTeam_name(userRoles.getTeam_name());
		 * userRolesVO.setUser_objects(userRoles.getUser_objects());
		 * if(userRoles.getRolePermissions()!=null) {
		 * userRolesVO.setRole_id(userRoles.getRolePermissions().getRole_id());
		 * userRolesVO.setRole_type(userRoles.getRolePermissions().getRole_type());
		 * userRolesVO.setRole_name(userRoles.getRolePermissions().getRole_name()); } }
		 */
		
		return bookingDetailsVO;
	}

	@Override
	public List<BookingDetailsVO> getAllBookingDetailsList() {
		
		List<BookingDetailsVO>bookingDetailsList = new ArrayList<BookingDetailsVO>();
		/*
		 * List<UserRolesVO> userRolesVOList = new ArrayList<UserRolesVO>();
		 * List<UserRoles> userList = userRepository.findAll(); UserRolesVO userRolesVO
		 * = null; for(UserRoles userRoles : userList) { userRolesVO = new
		 * UserRolesVO(); userRolesVO.setId(userRoles.getId());
		 * userRolesVO.setUser_id(userRoles.getUser_id());
		 * userRolesVO.setUser_name(userRoles.getUser_name());
		 * userRolesVO.setPassword(userRoles.getPassword());
		 * userRolesVO.setUser_email(userRoles.getUser_email());
		 * userRolesVO.setDepartment(userRoles.getDepartment());
		 * userRolesVO.setTeam_name(userRoles.getTeam_name());
		 * userRolesVO.setUser_objects(userRoles.getUser_objects());
		 * if(userRoles.getRolePermissions()!=null) {
		 * userRolesVO.setRole_type(userRoles.getRolePermissions().getRole_type());
		 * userRolesVO.setRole_name(userRoles.getRolePermissions().getRole_name()); }
		 * userRolesVOList.add(userRolesVO); }
		 */
		
		return bookingDetailsList;
	}
	
}