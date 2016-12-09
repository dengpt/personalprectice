package com.dpt.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author uisftech
 *
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	@RequestMapping("/")
    public String index() {
        return "index";
    }
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
