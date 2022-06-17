package com.damian.api.rest.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damian.api.rest.challenge.entity.User;
import com.damian.api.rest.challenge.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}

	@Override
	public Iterable<User> getUserByUsername(String username) {
		return repository.findByUsername(username);
	}

	@Override
	public User createUser(User user) {
		user = repository.save(user);
		return user;
	}


}
