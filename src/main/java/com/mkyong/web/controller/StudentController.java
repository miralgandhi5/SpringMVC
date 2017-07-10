package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/{firstName}/{lastName}")
    @ResponseBody
    ModelAndView pathDemo(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
     ModelAndView modelAndView=new ModelAndView("index");
     modelAndView.addObject("firstName",firstName);
    modelAndView.addObject("lastName",lastName);
    return modelAndView;
    }


}