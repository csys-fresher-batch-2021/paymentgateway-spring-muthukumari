package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.factorymethod.BankFactory;
import com.example.implementation.BankDaoImpl;

@RestController
public class BankController {

	/**
	 * This method used to get the bank name list
	 * 
	 * @return
	 */
	@GetMapping("BankNameListServlet")
	public List<String> getBankNameList() {
		BankDaoImpl bank = BankFactory.getInstance();
		return bank.getBankNameList();
	}

}