package com.wolken.hackerrank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="user_details")
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class UserEntity {
	@Id
	private int id;
	private String username;
	private String email;
	private String password;
	private long contactNumber;
	public void setUsername(Object username2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	public void setContactNumber(Object contactNumber2) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(Object password2) {
		// TODO Auto-generated method stub
		
	}
	public void setId(Object id2) {
		// TODO Auto-generated method stub
		
	}
}