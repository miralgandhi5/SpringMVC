package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class StudentController {


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(User user) {
        return "FirstName " + user.getFirstName() + " LastName " + user.getLastName();
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("submit");
        return modelAndView;
    }
}