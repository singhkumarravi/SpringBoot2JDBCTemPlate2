package com.olive.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private int id;
	private String firstName;
	private String lastname;
	private String address;
	private String city;
	public Person() {
		
	}
	
	public Person(int id, String firstName, String lastname, String address, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", address=" + address
				+ ", city=" + city + "]";
	}




	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
