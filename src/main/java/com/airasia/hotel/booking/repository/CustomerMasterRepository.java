package com.airasia.hotel.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airasia.hotel.booking.model.CustomerMaster;

/**
 * 
 * @author Kirthy Saradhi D
 *
 */
@Repository
public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, Integer>{

}
