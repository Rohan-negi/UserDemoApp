package com.example.demo;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonMappingException;

@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService = new UserService();

	@GetMapping("/")
	List<User> getUsers() {
		System.out.println("called");
		return userService.getUsers();
	}

	@GetMapping("/{id}")
	ResponseEntity<User> getUser(@PathVariable Integer id) {
		System.out.println("called .." + id);
		User user = new User();
		ResponseEntity<User> entity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		try {
			user = userService.getUser(id);
			entity.ok(user);
		} catch (Exception e) {
			entity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return entity;
	}

	@PostMapping("/addUser")
	@ResponseStatus(code = HttpStatus.CREATED)
	private Integer saveUser(@RequestBody User user) throws IOException { 
		return userService.save(user);
	}

	@ExceptionHandler(value = IllegalArgumentException.class)
	void handleException() {
	}

	
	@PutMapping
	String handlePutMapping() {
		return "Put called";
	}

	@GetMapping("/age/{age}")
	List<User> getUserByAge(@PathVariable("age") int age) {
		return userService.getUserByAge(age);
	}
}