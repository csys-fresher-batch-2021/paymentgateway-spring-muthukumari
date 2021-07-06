package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.BankService;

@RestController
public class BankController {

	@Autowired
	BankService bank;

	/**
	 * This method used to get the bank name list
	 * 
	 * @return
	 */
	@GetMapping("BankNameListServlet")
	public List<String> getBankNameList() {
		return bank.getBankNameList();
	}

}
