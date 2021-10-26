package com.wolken.hackerrank.dao;


import com.wolken.hackerrank.entity.UserEntity;
import com.wolken.hackerrank.entity.LoginEntity;

public interface RegistrationDAO {
	public int save(UserEntity entity);
	LoginEntity getByEmail(String email);
	int forgotPassword(LoginEntity entity);
}