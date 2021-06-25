package com.example.implementation;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.dao.BankDao;
import com.example.util.ConnectionUtil;

@SpringBootApplication
public class BankDaoImpl implements BankDao {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	/**
	 * This method used to get the bank name list from DB
	 */
	@Override
	public List<String> getBankNameList() {
		String sql = "select bank_name from bank_details where bank_name!=''";
		List<String> bankNameList = jdbcTemplate.queryForList(sql, String.class);
		return bankNameList;
	}
}
