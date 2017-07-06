package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {
		System.out.println(name);

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);
		model.addObject("message", "Spring 3 MVC Hello World");

		return model;

	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView user(@ModelAttribute("User") User user) {
		System.out.println(user.name);
		ModelAndView modelAndView = new ModelAndView("submit");
		modelAndView.addObject("user",user);
		return modelAndView;




	}

}