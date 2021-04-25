package com.AddressBookProject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AddressBookProject.dto.AddressBookDTO;
import com.AddressBookProject.dto.ResponseDTO;
import com.AddressBookProject.model.AddressBookData;
import com.AddressBookProject.services.AddressBookServiceInterface;



@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@Autowired
	private	AddressBookServiceInterface service;
	
	@RequestMapping({"/get","","/"})
	
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		List <AddressBookData> addDataList = null;
		addDataList = service.getAddressBookData();
		ResponseDTO responseDTO =new ResponseDTO("Get call successful", addDataList);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@GetMapping("/get/{perId}")
	public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable ("perId") int perId){
		AddressBookData addressBookData = service.getAddressBookDataById(perId);
		ResponseDTO responseDTO=new ResponseDTO("Get call for id "+perId+" successful", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO , HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@Valid@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData=service.createAddressBookData(addressBookDTO);
		ResponseDTO responseDTO =new ResponseDTO("Created!", addressBookData);
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update/{perId}")
	public ResponseEntity<ResponseDTO>updateData( @PathVariable ("perId") int perId, @Valid@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData=service.updateAddressBookData(perId, addressBookDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated details for "+ perId+" number", addressBookData);
		
		return new ResponseEntity<ResponseDTO>( responseDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{perId}")
	public ResponseEntity<ResponseDTO> deleteDataById(@PathVariable ("perId") int perId){
		service.deleteDataById(perId);
		ResponseDTO responseDTO=new ResponseDTO("Deleted Contact!", "Deleted id :"+perId);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	

}
