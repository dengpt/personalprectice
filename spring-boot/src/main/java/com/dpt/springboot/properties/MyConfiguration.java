package com.dpt.springboot.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ConnectionProperties.class)
public class MyConfiguration {

	@Autowired
	private ConnectionProperties connectionProperties;
	
	public String showConfig(){
		String userName = connectionProperties.getUserName();
		String password = connectionProperties.getPassword();
		String address = connectionProperties.getAddress();
		String port = connectionProperties.getPort();
		
		return "hostUrl=" + address + ":" + port + "@@" + userName + "@@" + password;
	}
}
