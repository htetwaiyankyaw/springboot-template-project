package com.spring.rest.zconfig.oath2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.custommapper.SecurityMapper;
import com.spring.rest.dto.LoginUser;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class UserDao {
	@Autowired
	private SecurityMapper securityMapper;

	public LoginUser findByUsername(String username) {
		return securityMapper.loadUserByUsername(username);
	}
	
}
