package com.wolken.Facebook.service;

import com.wolken.Facebook.dto.UserDTO;

import com.wolken.Facebook.dao.Dao;
import com.wolken.Facebook.dao.DaoImpl;
import com.wolken.Facebook.dto.UserDTO;
import com.wolken.Facebook.entity.UserEntity;
public class ServiceImpl implements Service {

	public String validateAndSave(UserDTO dto) {
		
		 UserEntity entity=new UserEntity();
	        if (dto !=null){
	            entity.setId(dto.getId());
	            entity.setName(dto.getName());
	            entity.setEmail(dto.getEmail());
	            entity.setDob(dto.getDob());
	            entity.setGender(dto.getGender());
	        }
	        Dao dao=new DaoImpl();
	        return dao.save(entity);
	    }
	}