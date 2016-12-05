package com.dpt.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpt.springboot.bean.Demo;
import com.dpt.springboot.repository.UserRepository;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/getDemo")
	public Demo getDemo(){
		Demo demo = new Demo();
		demo.setId(1000);
		demo.setName("Truamp");
		return demo;
	}
	@RequestMapping("/zeroException")
	public int zeroException(){
		return 100/0;
	}
}
