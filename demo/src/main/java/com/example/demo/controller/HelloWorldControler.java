package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {
			
	    @RequestMapping("/hello")
		public String index(){
			return "This is my first SpringBoot project,Hello World!";
		}
		
	}
