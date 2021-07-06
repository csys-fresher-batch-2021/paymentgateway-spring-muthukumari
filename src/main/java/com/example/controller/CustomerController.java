package com.example.controller;

import javax.validation.Valid;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Message;
import com.example.dto.RegistrationDTO;
import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@GetMapping("UserNameValidationServlet/{userName}")
	public boolean iValidUserName(@PathVariable("userName") String userName) {
		boolean isValidName = CustomerService.isUserNameExists(userName);
		return isValidName;
	}

	@PostMapping("RegistrationServlet")
	public ResponseEntity<?> userRegistration(@Valid @RequestBody RegistrationDTO registrationDto) {
		Customer customer = new Customer(registrationDto.getMobileNo(), registrationDto.getFirstName(),
				registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getUserName(),
				registrationDto.getPassword());
		Message message = new Message();
		try {
			customerService.register(customer);
			message.setInfoMessage("***Registered Successfully***");
			return new ResponseEntity<>(message, HttpStatus.OK);
		} catch (ServiceException e) {
			message.setErrorMessage(e.getMessage());
			return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		}

	}
}
