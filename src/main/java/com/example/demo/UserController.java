package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	ArrayList<User> userList = new ArrayList<User>();
	
	@GetMapping("/all")
	List<User> getAllUsers() {
		return userService.getUsers();
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.saveUser(user);
		return "User successfully added !";
	}
	
	/*
	 * @PostMapping("/deleteUser/{id}") public String deleteUser(@PathVariable
	 * String id) { userService.deleteUser(id); return "User deleted successfully";
	 * }
	 */
}
