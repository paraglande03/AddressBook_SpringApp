package com.AddressBookProject.model;

import com.AddressBookProject.dto.AddressBookDTO;

import lombok.Data;


public @Data class AddressBookData {
	
	private int personId;
	 public String first_name;
		public String last_name;
		public String phone_number;
		public String email;
		public String city;
		public String state;
		public long zip;
		

		
		public AddressBookData(int personId, AddressBookDTO addressBookDTO) {
			super();
			this.personId =personId;
			this.first_name = addressBookDTO.first_name;
			this.last_name = addressBookDTO.last_name;
			this.phone_number = addressBookDTO.phone_number;
			this.email = addressBookDTO.email;
			this.city = addressBookDTO.city;
			this.state = addressBookDTO.state;
			this.zip = addressBookDTO.zip;
		}
		public AddressBookData() {
			
			
		}
		
		
}
