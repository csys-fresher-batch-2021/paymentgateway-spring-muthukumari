package com.example.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Table(value = "customer_registration_details")

public class Customer {

	@Id
	private int customer_id;

	@Column("mobile_no")
	private final Long mobileNo;

	@Column("first_name")
	private final String firstName;

	@Column("last_name")
	private final String lastName;

	@Column("email_id")
	private final String email;

	@Column("user_name")
	private final String userName;

	private final String password;

	@Column("registered_date")
	private LocalDate registeredDate = LocalDate.now();

}
