package com.AddressBookProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class AddressbookApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(AddressbookApplication.class, args);
		
		log.info("AddressBook App Started in {} environment",context.getEnvironment().getProperty("environment"));
		
	}

}
