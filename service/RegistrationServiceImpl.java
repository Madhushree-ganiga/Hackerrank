package com.wolken.hackerrank.service;

import java.util.Objects;
import java.util.Scanner;

import com.wolken.hackerrank.dao.RegistrationDAO;
import com.wolken.hackerrank.dao.RegistrationDAOImpl;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.entity.UserEntity;
import com.wolken.hackerrank.entity.LoginEntity;


public class RegistrationServiceImpl implements RegistrationService {
RegistrationDAO dao=new RegistrationDAOImpl();
	


public String validateandsave(UserDTO dto) {
     UserEntity entity=new UserEntity();
	if(dto.getId()>0) {
		if(!dto.getUsername().equals(null) && !dto.getUsername().equals("")) {
			if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
				if(dto.getContactNumber()>5999999999l && dto.getContactNumber()<=9999999999l) {
					if(dto.getPassword().equals(dto.getConpassword())) {
						entity.setId(dto.getId());
						entity.setUsername(dto.getUsername());
						entity.setEmail(dto.getEmail());
						entity.setPassword(dto.getPassword());
						entity.setContactNumber(dto.getContactNumber());
						
						int rows=dao.save(entity);
						if(rows > 0)
						{
							return "data saved";
						}
						else {
							return "data not saved";
						}
						} else 
							return "password doesnot match";
					} else
						return "enter valid contact no";
				}else
					return "enter valid email address";
			}else
				return "enter valid name";
		}else
			return "enter valid id";
	}

		
public String validateandLogin(LoginDTO ldto) {
	if(!Objects.isNull(ldto))
	{
		if(!ldto.getEmail().equals(null) && !ldto.getEmail().equals("")) {
			LoginEntity entity=dao.getByEmail(ldto.getEmail());
			if(ldto.getPassword().equals(entity.getPassword())) {
				return "login successful";
			} else {
				return "enter valid email id";
			} 
			} else {
				return "please provide valid email id";
				
			}
		}else { 
			return "object is null";
	}
	
}

public String validateandUpdatePassword(String email) {
	Scanner sc=new Scanner(System.in);
	if(!email.equals(null) && !email.equals(""))
	{
		LoginEntity entity=dao.getByEmail(email);
		if(entity !=null)
		{
			System.out.println("enter new password");
			String password=sc.nextLine();
			System.out.println("confirm password");
			String conPassword=sc.nextLine();
			
			if(password.equals(conPassword))
			{
				entity.setEmail(email);
				entity.setPassword(password);
				
				int isUpdate=dao.forgotPassword(entity);
				if(isUpdate>0)
				{
					return "password updated";
				} else {
					return "password not updated";
				}
			
			} else {
				return "password doesnot match";
			} 
				
			} else {
				return "enter valid email";
		}
		
	}else {
		return "enter valid email id";
	}
	
}


}
			

	