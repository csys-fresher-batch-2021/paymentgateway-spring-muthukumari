package com.example.implementation;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.dao.BankDAO;
import com.example.util.ConnectionUtil;

public class BankDaoImpl implements BankDAO {

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
