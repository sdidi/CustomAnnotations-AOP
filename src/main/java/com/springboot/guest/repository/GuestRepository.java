package com.springboot.guest.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.guest.model.Guest;

public interface GuestRepository extends CrudRepository<Guest,Long>{

}
