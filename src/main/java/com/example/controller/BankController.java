package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.BankDaoImpl;

@RestController
public class BankController {

	@GetMapping("BankNameListServlet")
	public List<String> getBankNameList() {
		System.out.println("hi.....");
		BankDaoImpl b = new BankDaoImpl();
		return b.getBankNameList();
	}

}
