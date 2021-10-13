package com.example.demo;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository repository;

	@Transactional(rollbackOn = Exception.class)
	public Integer save(User user) throws IOException {
		if (user.getAge() < 21) {
			throw new IllegalArgumentException();
		}
		repository.save(user);
		if(1==1) {
			throw new IOException();
		}
		return user.getId();
	}

	public List<User> getUsers() {
		return repository.findAll();
	}

	public List<User> getUserByAge(int age) {
		return repository.findByAge(age);
	}

	public User getUser(Integer id) {
		User user = repository.getById(id);
		return user;
	}
}