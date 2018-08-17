package com.springboot.guest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.guest.model.Guest;

@Service
public interface GuestService {

	Guest findByID(Long id);

	List<Guest> listAll();
	  
	void saveOrUpdate(Guest guest);
	  
	void delete(Long id);
}
