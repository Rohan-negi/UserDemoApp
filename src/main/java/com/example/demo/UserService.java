package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
		System.out.println(user);
	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
	/*
	 * public void deleteUser(Integer id) { userRepository. }
	 */
}
