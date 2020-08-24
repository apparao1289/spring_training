package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.mode.RegistrationForm;
import com.springmvc.service.StudentBusiness;

@Controller
public class RegistrationController {
	
	@Autowired
	private StudentBusiness studentBusiness;

	//@RequestMapping(value = "/registration", method = RequestMethod.GET)
	@GetMapping("/registration")
	public ModelAndView showRegistartionForm() {

		return new ModelAndView("resgistration", "registrationForm", new RegistrationForm());
	}

	//@RequestMapping(value = "/save", method = RequestMethod.POST)
	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute("registrationForm") RegistrationForm registrationForm) {
		
		// Connect to database and save.
		studentBusiness.createStudent(registrationForm);
		
		System.out.println("First Name:"+registrationForm.getFirstName());
		System.out.println("Last Name:"+registrationForm.getLastName());
		System.out.println("Age:"+registrationForm.getAge());
		System.out.println("Address:"+registrationForm.getAddress());
		System.out.println("Class:"+registrationForm.getStand());
		
		return new ModelAndView("success","registrationForm",registrationForm);
	}
}
