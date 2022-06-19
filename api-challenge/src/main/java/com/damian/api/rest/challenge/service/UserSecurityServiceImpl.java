package com.damian.api.rest.challenge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damian.api.rest.challenge.entity.SecurityGroup;
import com.damian.api.rest.challenge.entity.User;
import com.damian.api.rest.challenge.entity.UserSecurity;
import com.damian.api.rest.challenge.repository.SecurityGroupRepository;
import com.damian.api.rest.challenge.repository.UserRepository;
import com.damian.api.rest.challenge.repository.UserSecurityRepository;

@Service
public class UserSecurityServiceImpl implements UserSecurityService{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SecurityGroupRepository sgRepository; 
	
	@Autowired
	UserSecurityRepository repository;

	@Override
	public List<UserSecurity> findGroupByUsername(String username) {
		return repository.getGroupByUsername(username);
	}

	@Override
	public UserSecurity createUserSecurity(UserSecurity userSecurity) {
		userSecurity = repository.save(userSecurity);
		return userSecurity;
	}

	
}
