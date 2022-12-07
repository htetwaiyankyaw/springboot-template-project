package com.spring.rest.zconfig.oath2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.rest.dto.LoginUser;

@Service(value = "UserService")
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	public CustomPasswordEncoder passwordEncoder;

	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		LoginUser user = userDao.findByUsername(userId);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return user;
	}
}