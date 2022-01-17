package com.my.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub2")
public class Sub2Controller {
	
	private String TAG = "===== "+Sub2Controller.class.getSimpleName()+" >> ";
	
	@RequestMapping(value = "/neo", method = RequestMethod.GET)
	public String neo() {
		System.out.println(TAG+"neo()");
		return "neo";
	}

}