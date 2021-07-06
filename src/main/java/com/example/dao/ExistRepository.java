package com.example.dao;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface ExistRepository {

	public boolean isExistUserName(@Param("userName") String userName);

	public boolean isExistEmail(@Param("email") String email);

}