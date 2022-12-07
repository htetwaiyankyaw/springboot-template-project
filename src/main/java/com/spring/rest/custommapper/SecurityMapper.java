package com.spring.rest.custommapper;

import org.apache.ibatis.annotations.Mapper;

import com.spring.rest.dto.LoginUser;

@Mapper
public interface SecurityMapper {
	/**
	 * For Spring Security
	 */
	public LoginUser loadUserByUsername(String username);
}