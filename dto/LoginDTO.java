package com.wolken.hackerrank.dto;


import javax.persistence.Id;

import lombok.Data;

@Data
public class LoginDTO {
	
	private String email;
	private String password;
	

}
