package com.OAuth2App;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResourceServer {
	
	@GetMapping("/showMyLoginPage")
	public String showLoginPage() {
		return "fancy-login";
	}
	@GetMapping("/access-denied")
	public String accessdenied() {
		return "access-denied";
	}


}
