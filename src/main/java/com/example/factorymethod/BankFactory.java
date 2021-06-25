package com.example.factorymethod;

import com.example.implementation.BankDaoImpl;

public class BankFactory {
	private static BankDaoImpl bank = new BankDaoImpl();

	public static BankDaoImpl getInstance() {
		return bank;
	}
}
