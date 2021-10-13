package com.example.onetomanybi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CartService {
	
	@Autowired
	CartRepository cartRepository;
	
	public void saveCart(Cart cart) {
		cartRepository.save(cart);
	}
}
