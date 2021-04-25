package com.AddressBookProject.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.AddressBookProject.dto.ResponseDTO;

@ControllerAdvice
public class ExceptionHandlerAddressBook {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseDTO> handlerMethodArgNotValidException(MethodArgumentNotValidException exception){
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errormsg = errorList.stream().map(objerr-> objerr.getDefaultMessage()).collect(Collectors.toList());
		ResponseDTO responseDTO = new ResponseDTO("Exception while processing rest request", errormsg);
		return new ResponseEntity<ResponseDTO>(responseDTO , HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(AddressBookCustomException.class)
	public ResponseEntity<ResponseDTO> idNotFoundException(AddressBookCustomException exception){
		ResponseDTO responseDTO =new ResponseDTO("contact with this Id in not in the data", exception.getMessage());
		
		return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
	}

}
