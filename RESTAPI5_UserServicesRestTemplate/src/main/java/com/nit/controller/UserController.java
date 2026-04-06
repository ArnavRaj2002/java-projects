package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.User;
import com.nit.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/all")
public ResponseEntity<List<User>> findAll()
{
	List<User> allUsers = userService.getAllUsers();
	return new ResponseEntity<List<User>>(allUsers, HttpStatus.FOUND);
}
@GetMapping("/find/{id}")
public User getUserById(@PathVariable("id") Integer id1)
{
	User user = userService.getUser(id1);
	return user;
}
@PostMapping("/save")
public String saveUser(@RequestBody User user)
{
	String msg = userService.addUser(user);
	return msg;
	
}
}
