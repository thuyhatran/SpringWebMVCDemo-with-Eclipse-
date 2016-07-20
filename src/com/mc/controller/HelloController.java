/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mc.controller;




import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;



/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/greet")
public class HelloController /*extends AbstractController*/{

//    @Override
//    protected ModelAndView handleRequestInternal(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
//        ModelAndView modelandview = new ModelAndView("index");
//        modelandview.addObject("welcomeMessage","Hi User, welcome to the first Spring MVC Application");
//        return modelandview;
//    }
	
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars){
		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("welcomeMessage","hello " + name + ". You are from " + country);
		
		return model;
	}
	
	@RequestMapping("/hi/{countryName}/{cityName}/{userName}")
	public ModelAndView hiWorld(@PathVariable("countryName") String country, @PathVariable("cityName") String city, 
					@PathVariable("userName") String user){
				
		ModelAndView model = new ModelAndView("index");
		model.addObject("welcomeMessage","Hi " + user + ". You are from " + city + ", " + country);
		return model;
	}
	
	@RequestMapping("/")
	public ModelAndView rootWorld(){
		ModelAndView model = new ModelAndView("index");
		model.addObject("welcomeMessage","Root World");
		return model;
	}

	
      
}
