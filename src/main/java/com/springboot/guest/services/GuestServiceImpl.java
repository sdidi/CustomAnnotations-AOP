package com.springboot.guest.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.guest.annotations.LogHere;
//import com.springboot.guest.annotation.LogHere;
import com.springboot.guest.model.Guest;
//import com.springboot.guest.model.LogMethod;
import com.springboot.guest.repository.GuestRepository;
@Service
@Component
public class GuestServiceImpl implements GuestService{
   private GuestRepository guestRepository;
   
  // @Autowired
	//private LogHereService logHereService;
   
    @Autowired
	public GuestServiceImpl(GuestRepository guestRepository) {
		this.guestRepository = guestRepository;
     }

	@Override
	@com.springboot.guest.annotations.LogHere 
	public Guest findByID(Long id) {
		//logHereService.LogHere(new LogMethod());
		return guestRepository.findById(id).orElse(null);
	}

	@Override
	//@LogHere
	public List<Guest> listAll() {
		List<Guest> guestList = new ArrayList<Guest>();
		guestRepository.findAll().forEach(guestList::add);
		return guestList;
	}

	@Override
	public void saveOrUpdate(Guest guest) {
		guestRepository.save(guest);
		}

	@Override
	public void delete(Long id) {
		guestRepository.deleteById(id);		
	}
      
}
