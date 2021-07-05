package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.BankDAO;
import com.example.factorymethod.BankFactory;

@Service
public class BankService {

	/**
	 * This method used to get the bank name list
	 * 
	 * @return
	 */
	public List<String> getBankNameList() {
		BankDAO bank = BankFactory.getInstance();
		return bank.getBankNameList();
	}
}
