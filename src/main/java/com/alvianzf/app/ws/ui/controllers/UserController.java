package com.alvianzf.app.ws.ui.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {

	@GetMapping
	public String getUser()
	{
		return "getUser was called!";
	}
	
	@PostMapping
	public String postUser()
	{
		return "post user was called!";
	}
	
	@PutMapping
	public String updateUser()
	{
		return "put user was called!";
	}
	
	@DeleteMapping
	public String deleteUser()
	{
		return "delete user was called!";
	}
}
