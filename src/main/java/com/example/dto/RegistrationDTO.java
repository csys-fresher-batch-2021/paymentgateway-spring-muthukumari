package com.example.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;
import lombok.NonNull;

@Data
public class RegistrationDTO {

	@NonNull
	@Digits(integer = 10, fraction = 0)
	private Long mobileNo;

	@NonNull
	@NotEmpty(message = "first name cannot be empty")
	@Length(min = 3, max = 50)
	@Pattern(regexp = "^[a-zA-Z\\\\s]*$")
	private String firstName;

	@NonNull
	@NotEmpty(message = "last name cannot be empty")
	@Length(min = 1, max = 50)
	@Pattern(regexp = "^[a-zA-Z\\\\s]*$")
	private String lastName;

	@NotBlank
	@NotEmpty(message = "email id cannot be empty")
	@Email(message = "email should be valid")
	private String email;

	@NonNull
	@NotEmpty(message = "user name cannot be empty")
	@Length(min = 5, max = 10)
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z])$")
	private String userName;

	@JsonProperty(access = Access.WRITE_ONLY)
	@Pattern(regexp = "^^(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*_=+-])$")
	@Length(min = 5, max = 50)
	private String password;

}