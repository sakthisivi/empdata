package com.tcs.acc.employeedata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/home")
    public String employee(Model model) {
        //model.addAttribute("employees", employeeRepository.findAll());
        return "home";
	}
	
	

}
