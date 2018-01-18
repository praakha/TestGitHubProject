package com.prakash;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showPage(ModelMap modelMap){
		modelMap.put("name","prakash");
		return "welcome";
	}

}
