package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.BankDaoImpl;

@RestController
public class BankController {

	/**
	 * This method used to get the bank name list
	 * 
	 * @return
	 */
	@GetMapping("BankNameListServlet")
	public List<String> getBankNameList() {
		BankDaoImpl bank = new BankDaoImpl();
		return bank.getBankNameList();
	}

}
