package com.wolken.hackerrank.dto;


import lombok.Data;

@Data
public class UserDTO {
	
	private int id;
	private String username;
	private String email;
	private String password;
	private String conpassword;
	private long contactNumber;
	
	
	
}