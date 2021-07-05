package com.example.factorymethod;

import com.example.dao.ExistRepository;
import com.example.implementation.ExistDaoImpl;

public class CustomerFactory {

	private static ExistRepository isExist = new ExistDaoImpl();

	public static ExistRepository getUserNameExists() {
		return isExist;
	}

	public static ExistRepository getEmailExists() {
		return isExist;
	}
}
