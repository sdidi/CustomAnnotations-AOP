package com.springboot.guest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Guest implements Serializable {
    
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
    private String name;
    private String address;
    private int guest_num;  
        
	public Guest(Long id, String name, String address, int guest_num) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.guest_num = guest_num;
	}
	
	public Guest() { }
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGuest_num() {
		return guest_num;
	}
	public void setGuest_num(int guest_num) {
		this.guest_num = guest_num;
	}
	@Override
	public String toString() {
		return "Guest [id=" + id + ", name=" + name + ", address=" + address + ", guest_num=" + guest_num + "]";
	}
    
    
}
