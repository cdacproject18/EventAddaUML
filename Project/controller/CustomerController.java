package com.eventaddaserver.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.eventaddaserver.dao.*;

@Controller
public class CustomerController {

	@Autowired
	private CustomerDao repository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView helloWorld(ModelMap model) {
		List customers = repository.findAll();
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("customer", customers);
		return modelAndView;
	}
}