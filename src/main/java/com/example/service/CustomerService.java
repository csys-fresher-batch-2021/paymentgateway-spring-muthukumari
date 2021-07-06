package com.example.service;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerRepository;
import com.example.model.Customer;
import com.example.validator.CustomerRepeatedValidator;

@Service
public class CustomerService {

	private static CustomerRepeatedValidator customerRepeatedValidator = new CustomerRepeatedValidator();

	@Autowired
	CustomerRepository customerRepository;

	public static boolean isUserNameExists(String userName) {
		boolean isRepeatedUser = customerRepeatedValidator.isUserNameExists(userName);
		return isRepeatedUser;
	}

	/**
	 * This method used to save the customer registration details to DB
	 * 
	 * @param customer
	 * @return
	 * @throws ServiceException
	 */
	public Customer register(Customer customer) throws ServiceException {
		if (customerRepeatedValidator.isEmailExists(customer.getEmail()) && isUserNameExists(customer.getUserName())) {
			throw new ServiceException("You are already registered");
		} else {
			// Exception from DAO layer will be handled by Controller
			return customerRepository.save(customer);
		}
	}
}
