package com.springDrone.ecommerce.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class WelcomeController {

	@GetMapping("/")
	public String home() {
		return "home/home";
	}

}