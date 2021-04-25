package com.AddressBookProject.services;

import java.util.List;

import com.AddressBookProject.dto.AddressBookDTO;
import com.AddressBookProject.model.AddressBookData;

public interface AddressBookServiceInterface {
	
	List <AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int personId);
	
	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(int personId , AddressBookDTO addressBookDTO);
	
	public void deleteDataById(int personId);
}
