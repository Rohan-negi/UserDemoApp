package com.example.onetomanybi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cart")
@RestController
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/save")
	public void saveCart(@RequestBody Cart cart) {
		cartService.saveCart(cart);
	}

}
