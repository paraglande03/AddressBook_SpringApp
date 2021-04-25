package com.AddressBookProject.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.AddressBookProject.dto.AddressBookDTO;
import com.AddressBookProject.exceptions.AddressBookCustomException;
import com.AddressBookProject.model.AddressBookData;

@Service
public class AdressBookService implements AddressBookServiceInterface {
	List <AddressBookData> list =new ArrayList<>();
	
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		
		return list;
	}


	@Override
	public AddressBookData getAddressBookDataById(int personId) {
		return list.stream().filter(abData->abData.getPersonId()==personId)
				.findFirst().orElseThrow(()-> new AddressBookCustomException("Person not found"));
		
		
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
		list.remove(personId-1);
		
	}
	
	
	
	
	
	

}
