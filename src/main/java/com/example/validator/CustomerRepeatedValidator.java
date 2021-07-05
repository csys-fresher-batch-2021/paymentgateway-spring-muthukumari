package com.example.validator;

import org.springframework.stereotype.Component;

import com.example.dao.ExistRepository;
import com.example.factorymethod.CustomerFactory;

@Component
public class CustomerRepeatedValidator {

	/**
	 * This method used to check the user name exists or not
	 * 
	 * @param userName
	 * @return
	 */
	public boolean isUserNameExists(String userName) {
		ExistRepository isExist = CustomerFactory.getUserNameExists();
		boolean isRepeatedUser = isExist.isExistUserName(userName);
		return isRepeatedUser;
	}

	/**
	 * This method used to check the email exists or not
	 * 
	 * @param userName
	 * @return
	 */
	public boolean isEmailExists(String email) {
		ExistRepository isExist = CustomerFactory.getEmailExists();
		boolean isRepeatedEmail = isExist.isExistEmail(email);
		return isRepeatedEmail;
	}
}
