package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {


    @RequestMapping("/")
    @ResponseBody
    ModelAndView index() {
        return new ModelAndView("index string");
    }


}