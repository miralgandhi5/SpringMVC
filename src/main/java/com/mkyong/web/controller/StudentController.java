package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller

public class StudentController {


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView pathDemo(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("firstName", firstName);
        modelAndView.addObject("lastName", lastName);
        return modelAndView;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("submit");
        return modelAndView;
    }
}