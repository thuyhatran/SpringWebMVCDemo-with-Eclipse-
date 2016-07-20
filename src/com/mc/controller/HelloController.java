/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author Administrator
 */
@Controller
public class HelloController /*extends AbstractController*/{

//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
//        ModelAndView modelandview = new ModelAndView("index");
//        modelandview.addObject("welcomeMessage","Hi User, welcome to the first Spring MVC Application");
//        return modelandview;
//    }
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView model = new ModelAndView("index");
		model.addObject("welcomeMessage","hello world");
		
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		ModelAndView model = new ModelAndView("index");
		model.addObject("welcomeMessage","Hi World");
		return model;
	}
	
	@RequestMapping("/")
	public ModelAndView rootWorld(){
		ModelAndView model = new ModelAndView("index");
		model.addObject("welcomeMessage","Root World");
		return model;
	}
	
	
      
}
