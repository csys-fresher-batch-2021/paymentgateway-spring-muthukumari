package com.example.util;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {

	private ConnectionUtil() {
		// default constructor
	}

	private static final String DRIVER_CLASS_NAME = System.getenv("spring.datasource.driver-class-name");
	private static final String DB_URL = System.getenv("spring.datasource.url");
	private static final String DB_USERNAME = System.getenv("spring.datasource.username");
	private static final String DB_PASSWORD = System.getenv("spring.datasource.password");

	/**
	 * This method used to get the DB connection
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static JdbcTemplate getJdbcTemplate() {
		DataSource dataSource = getDataSource();
		return new JdbcTemplate(dataSource);

	}

	private static DataSource getDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(DRIVER_CLASS_NAME);
		ds.setUrl(DB_URL);
		ds.setUsername(DB_USERNAME);
		ds.setPassword(DB_PASSWORD);
		return ds;
	}
}