package com.alvianzf.app.ws.ui.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users") //http://localhost:8080/users
public class UserController {

	@GetMapping()
	public String getUsers(@RequestParam(value="page", defaultValue="1", required=false) int page,
			@RequestParam(value="limit", defaultValue="50") int limit,
			@RequestParam(value="sort", required=false, defaultValue="desc") String sort)
	{
		return "getUser was called with page = " + page + " and limit = " + limit ;
	}
	
	@GetMapping(path="/{userId}")
	public String getUser(@PathVariable String userId)
	{
		return "getUser was called! userId = " + userId;
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
