package com.damian.api.rest.challenge.not.rest.controller;

import java.time.LocalDateTime;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.damian.api.rest.challenge.entity.User;
import com.damian.api.rest.challenge.service.UserService;

@Controller
@RequestMapping("/user")
public class UserNotRestController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/lista")
	public String listarUsers(Model model){
		
		model.addAttribute("users", (List<User>) userService.getAllUsers());
		return "lista";
	}
	
	@GetMapping("/getByUsername/{username}")
	public List<User> getByUsername(@PathVariable("username") String username){
		return (List<User>) userService.getUserByUsername(username);
	}
	
	@GetMapping("/createUser")
	public String userForm(Model model) {
		
		model.addAttribute("user", new User());
		model.addAttribute("users", (List<User>) userService.getAllUsers());
		
		
		return "form";
	}
	
	@PostMapping("/createUser")
	public String crearUsuario(User user, Model model) {
		user.setCreateAt(LocalDateTime.now().toString());
		userService.createUser(user);
		model.addAttribute("users", (List<User>) userService.getAllUsers());
		
		return "lista";
	}
}
