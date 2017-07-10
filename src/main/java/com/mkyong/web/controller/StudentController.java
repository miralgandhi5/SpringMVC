package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentController extends MultiActionController {


	public ModelAndView dummy(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		ModelAndView modelAndView=new ModelAndView("index");
		return modelAndView;

	}

	public void dummy2(HttpServletRequest httpServletRequest,
					   HttpServletResponse httpServletResponse) throws Exception {
		httpServletResponse.setContentType("text/html");
		httpServletResponse.getWriter().println("<b>HELLO World</b>");
	}









}