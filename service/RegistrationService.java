package com.wolken.hackerrank.service;

import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.dto.LoginDTO;
public interface RegistrationService {
	public String validateandsave(UserDTO dto);
	String validateandLogin(LoginDTO ldto);

	String validateandUpdatePassword(String email);
	
}