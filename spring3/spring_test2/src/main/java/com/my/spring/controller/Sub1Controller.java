package com.my.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Sub1Controller {
	
	private String TAG = "===== "+Sub1Controller.class.getSimpleName()+" >> ";
	
	@RequestMapping(value = "/sub1/muzi", method = RequestMethod.GET)
	public String muzi() {
		System.out.println(TAG+"muzi()");
		return "muzi";
	}

}