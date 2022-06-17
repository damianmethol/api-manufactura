package com.damian.api.rest.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damian.api.rest.challenge.entity.UserSecurity;
import com.damian.api.rest.challenge.service.UserSecurityService;

@RestController
@RequestMapping("/userSecurity")
public class UserSecurityController {

	@Autowired
	UserSecurityService userSecurityService;
	
	@GetMapping("/getGroupByUsername/{username}")
	public List<UserSecurity> getGroupByUsername(@PathVariable("username") String username){
		return userSecurityService.findGroupByUsername(username);
	}
	
}
