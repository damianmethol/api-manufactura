package com.damian.api.rest.challenge.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damian.api.rest.challenge.entity.User;
import com.damian.api.rest.challenge.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/lista")
	public List<User> listarUsers(){
		return (List<User>) userService.getAllUsers();
	}
	
	@GetMapping("/getByUsername/{username}")
	public List<User> getByUsername(@PathVariable("username") String username){
		return (List<User>) userService.getUserByUsername(username);
	}
	
	@PostMapping("/createUser")
	public void saveUser(@RequestBody User user) {
		if(user.getCreateAt()==null) {
			user.setCreateAt(LocalDateTime.now().toString());
		}
		userService.createUser(user);
	}
}
