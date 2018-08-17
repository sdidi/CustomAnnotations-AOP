package com.springboot.guest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.guest.model.Guest;
import com.springboot.guest.services.GuestService;

@RestController
@RequestMapping("guest")
public class GuestController {
    
	
	@Autowired
	GuestService guestService;
	
	@GetMapping("guest/{id}")
	public ResponseEntity<Guest> getGuestById(@PathVariable("id") Long id) {
		Guest guest = guestService.findByID(id);
		return new ResponseEntity<Guest>(guest, HttpStatus.OK);
	}
	
	@GetMapping("guests")
	public ResponseEntity<List<Guest>> getGuestList() {
		List<Guest> guestList = guestService.listAll();
		return new ResponseEntity<List<Guest>>(guestList, HttpStatus.OK);
	}
	
	
	/*
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String getStartPage(Model model) {
		return "home";
	}*/

}
