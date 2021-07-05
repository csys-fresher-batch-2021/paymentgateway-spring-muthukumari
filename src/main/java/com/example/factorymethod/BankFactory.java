package com.example.factorymethod;

import com.example.dao.BankDAO;
import com.example.implementation.BankDaoImpl;

public class BankFactory {

	private static BankDAO bank = new BankDaoImpl();

	/**
	 * This method used to get the object of the BankDAO class
	 */
	public static BankDAO getInstance() {
		return bank;
	}
}
