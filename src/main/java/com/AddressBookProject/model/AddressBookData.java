package com.AddressBookProject.model;

public class AddressBookData {
	
	private int personId;
	 public String first_name;
		public String last_name;
		public String phone_number;
		public String email;
		public String city;
		public String state;
		public long zip;
		
		public int getPersonId() {
			return personId;
		}
		public void setPersonId(int personId) {
			this.personId = personId;
		}
		
		public String getFirst_name() {
			return first_name;
		}
		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
		public String getLast_name() {
			return last_name;
		}
		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}
		public String getPhone_number() {
			return phone_number;
		}
		public void setPhone_number(String phone_number) {
			this.phone_number = phone_number;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public long getZip() {
			return zip;
		}
		public void setZip(long zip) {
			this.zip = zip;
		}
		
		public AddressBookData(int personId, String first_name, String last_name, String phone_number, String email,
				String city, String state, long zip) {
			super();
			this.personId = personId;
			this.first_name = first_name;
			this.last_name = last_name;
			this.phone_number = phone_number;
			this.email = email;
			this.city = city;
			this.state = state;
			this.zip = zip;
		}
		public AddressBookData() {
			
			
		}
		
		
}
