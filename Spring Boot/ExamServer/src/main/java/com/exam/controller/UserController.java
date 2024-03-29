package com.exam.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;
	
	//creating user
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception
	{
		Set<UserRole> roles= new HashSet<>();
		UserRole userRole = new UserRole();
		Role role = new Role(45L, "NORMAL");
		userRole.setRole(role);
		userRole.setUser(user);
		
		
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable String username)
	{
		return this.userService.getUser(username);
		
	}
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable Long id) {
		
		this.userService.deleteUser(id);
		return "Deleted";
	}
	
	@PutMapping("/{username}")
	public User updateUser(@PathVariable String username,@RequestBody User user)
	{
		
		
	
		return this.userService.updateUser(username,user);
		
	}
	
	
	
}
