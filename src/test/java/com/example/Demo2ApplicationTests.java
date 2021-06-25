package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.implementation.BankDaoImpl;

@SpringBootTest
class Demo2ApplicationTests {

	/**
	 * Test case for not null values
	 */
	@Test
	void TeatCase1() {
		BankDaoImpl bank = new BankDaoImpl();
		List<String> bankNameList = bank.getBankNameList();
		assertNotNull(bankNameList);
	}

}
