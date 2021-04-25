package com.AddressBookProject.services;

import java.util.ArrayList;
import java.util.List;

import com.AddressBookProject.dto.AddressBookDTO;
import com.AddressBookProject.model.AddressBookData;

public class AdressBookService implements AddressBookServiceInterface {
	List <AddressBookData> list =new ArrayList<>();
	
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		
		return list;
	}


	@Override
	public AddressBookData getAddressBookDataById(int personId) {
		return list.stream().filter(abData->abData.getPersonId()==personId)
				.findFirst().orElseThrow();
		
		
	}


	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData =new AddressBookData(list.size()+1,addressBookDTO);
		list.add(addressBookData);
		return addressBookData;
		
	}


	@Override
	public AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData =this.getAddressBookDataById(personId);
		addressBookData.setCity(addressBookDTO.city);
		addressBookData.setEmail(addressBookDTO.email);
		addressBookData.setFirst_name(addressBookDTO.first_name);
		addressBookData.setLast_name(addressBookDTO.last_name);
		addressBookData.setPhone_number(addressBookDTO.phone_number);
		addressBookData.setState(addressBookDTO.state);
		addressBookData.setZip(addressBookDTO.zip);
		list.set(personId-1, addressBookData);
		return addressBookData;
		
		
	}


	@Override
	public void deleteDataById(int personId) {
		list.remove(personId);
		
	}
	
	
	
	
	
	

}
