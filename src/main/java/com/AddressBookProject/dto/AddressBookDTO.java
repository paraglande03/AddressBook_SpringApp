package com.AddressBookProject.dto;

public class AddressBookDTO {
	
	private String name;
	private String city;
	private long phoneNumber;
	
	
	public AddressBookDTO(String name, String city, long phoneNumber) {
		super();
		this.name = name;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "AddressBookDTO [name=" + name + ", city=" + city + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
