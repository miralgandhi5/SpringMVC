package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/{firstName}/{lastName}")
    @ResponseBody
    ModelAndView pathDemo(@PathVariable Map<String, String> requestMap) {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("firstName", requestMap.get("firstName"));
        modelAndView.addObject("lastName", requestMap.get("lastName"));
        return modelAndView;
    }


}