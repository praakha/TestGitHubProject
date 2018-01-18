package com.prakash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeService welcomeService;
	
	@RequestMapping("/welcome")
	public String welcomeMessage(){
		return welcomeService.greet();
	}
	
	@Component
	class WelcomeService{
		public String greet(){
			return "Good Morning..!!!";
		}
	}
}
