package com.damian.api.rest.challenge.service;

import java.util.List;

import com.damian.api.rest.challenge.entity.SecurityGroup;
import com.damian.api.rest.challenge.entity.UserSecurity;

public interface UserSecurityService {

	public List<UserSecurity> findGroupByUsername(String username);
	
}
