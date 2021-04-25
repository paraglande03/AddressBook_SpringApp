package com.AddressBookProject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {
	
	@RequestMapping({"/get","","/"})
	
	public ResponseEntity<String> getAddressBookData(){
		return new ResponseEntity<String>("Get call successful for data",HttpStatus.OK);
	}

}
