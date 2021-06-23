package com.example.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.util.ConnectionUtil;

@SpringBootApplication
public class BankDaoImpl implements BankDao {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	@Override
	public List<String> getBankNameList() {
		String sql = "select bankname from banknamelist where bankname!=''";
		List<String> bankNameList = jdbcTemplate.queryForList(sql, String.class);
		return bankNameList;
	}
}
