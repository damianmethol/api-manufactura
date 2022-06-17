package com.damian.api.rest.challenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damian.api.rest.challenge.entity.UserSecurity;
import com.damian.api.rest.challenge.repository.UserSecurityRepository;

@Service
public class UserSecurityServiceImpl implements UserSecurityService{
	
	
	@Autowired
	UserSecurityRepository repository;

	@Override
	public List<UserSecurity> findGroupByUsername(String username) {
		return repository.getGroupByUsername(username);
	}

	
}
