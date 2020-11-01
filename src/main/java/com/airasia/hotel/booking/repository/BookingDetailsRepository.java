package com.airasia.hotel.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.airasia.hotel.booking.model.BookingDetails;


@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Integer>{

	public static final String FIND_BOOKINGDETAILS_BY_ID = "select b from BookingDetails b where b.id =:id";
	
	@Query(FIND_BOOKINGDETAILS_BY_ID)
	public BookingDetails findBookingDetailsById(@Param("id") Long id);

	public static final String DELETE_BOOKINGDETAILS_BY_ID = "DELETE from BookingDetails b where b.id =:id";
	
	@Query(DELETE_BOOKINGDETAILS_BY_ID)
	public void deleteById(long id);

}
