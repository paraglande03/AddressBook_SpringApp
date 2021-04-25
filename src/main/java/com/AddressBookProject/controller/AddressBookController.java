package com.AddressBookProject.controller;

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



@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping({"/get","","/"})
	
	public ResponseEntity<String> getAddressBookData(){
		return new ResponseEntity<String>("Get call successful for data",HttpStatus.OK);
	}
	
	@GetMapping("/get/{perId}")
	public ResponseEntity<String> getAddressBookDataById(@PathVariable ("perId") int perId){
		return new ResponseEntity<String>("Get call successful for id : "+perId , HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		return new ResponseEntity<String>("Created new contact "+ addressBookDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String>updateData(@RequestBody AddressBookDTO addressBookDTO){
		return new ResponseEntity<String>("Updated Data succesful :"+ addressBookDTO ,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{perId}")
	public ResponseEntity<String> deleteDataById(@PathVariable ("perId") int perId){
		return new ResponseEntity<String>("deleted data for Id :"+ perId, HttpStatus.OK);
	}
	
	

}
