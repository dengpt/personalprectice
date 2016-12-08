package com.dpt.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpt.springboot.properties.MyConfiguration;

@RestController
@RequestMapping("/config")
public class ConfigController {

	@Autowired
	private MyConfiguration myConfiguration;
	
	@RequestMapping("/uisftech")
	public String showConfig(){
		return myConfiguration.showConfig();
	}
}
