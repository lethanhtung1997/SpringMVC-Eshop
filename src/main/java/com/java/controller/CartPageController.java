package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartPageController {
	@GetMapping(value = "/cart")
	public String doCart() {
		return "cart";
	}
}
