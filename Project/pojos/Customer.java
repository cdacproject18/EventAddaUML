package com.eventaddaserver.pojos;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")
public class Customer {

	private int id;
	
	private String name ;
	private int number ;
	private Date dob ; 
	private String gender ;
	@Autowired
	private Address address ; 
	private String email ;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int id, String name, int number, Date dob, String gender, Address address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	
}
