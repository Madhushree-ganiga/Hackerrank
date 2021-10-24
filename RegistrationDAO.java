package com.wolken.hackerrank.dao;


import com.wolken.hackerrank.entity.UserEntity;

public interface RegistrationDAO {
	public int save(UserEntity entity);
}