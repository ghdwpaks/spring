package com.my.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	private String TAG = "===== "+TestController.class.getSimpleName()+" >> ";

	@RequestMapping(value = "/apeach", method = RequestMethod.GET)
	public String apeach() {
		System.out.println(TAG+"apeach()");
		return "apeach";
	}
}