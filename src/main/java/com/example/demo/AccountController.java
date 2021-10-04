package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	ArrayList<Account> accountList = new ArrayList<Account>();
	
	@GetMapping("/account/{name}") 
	Account getUserAccountDetails(@PathVariable String name) {
		System.out.println(name);
		for(Account account : accountList) {
			System.out.println(account.getOwnerName() + " -- ");
			if(account.getOwnerName().equals(name))
				return account;
		}
		
		System.out.println("Acccount Not found");
		return null;
	}
	
	@PostMapping("account")
	public String addAccount(@RequestBody Account account) {
		if(account.equals(null))
			return "Cannot enter null values";
		
		accountList.add(account);
		return "Account successfully added !";
	}

}
