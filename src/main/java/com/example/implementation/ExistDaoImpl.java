package com.example.implementation;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.dao.ExistRepository;
import com.example.util.ConnectionUtil;

public class ExistDaoImpl implements ExistRepository {

	JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();

	/**
	 * This method use to check the user name is already exist or not
	 */
	@Override
	public boolean isExistUserName(String userName) {
		String sql = "select user_name from customer_registration_details where user_name=?";
		boolean isExists = true;
		Object[] param = { userName };
		try {
			jdbcTemplate.queryForObject(sql, String.class, param);
		} catch (DataAccessException e) {
			isExists = false;
		}
		return isExists;
	}

	/**
	 * This method use to check the email is already exist or not
	 */
	@Override
	public boolean isExistEmail(String email) {
		String sql = "select email_id from customer_registration_details where email_id=?";
		boolean isExists = true;
		try {
			jdbcTemplate.queryForObject(sql, String.class, email);
		} catch (DataAccessException e) {
			isExists = false;
		}
		return isExists;
	}

}
