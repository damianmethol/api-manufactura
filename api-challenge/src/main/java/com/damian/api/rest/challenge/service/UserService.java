package com.damian.api.rest.challenge.service;

import com.damian.api.rest.challenge.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();
	
	public Iterable<User> getUserByUsername(String username);
	
	public User createUser(User user);
	
}
