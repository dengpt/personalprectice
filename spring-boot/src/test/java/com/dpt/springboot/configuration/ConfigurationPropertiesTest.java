package com.dpt.springboot.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dpt.springboot.App;
import com.dpt.springboot.properties.ConnectionProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class ConfigurationPropertiesTest {

	@Autowired
	private ConnectionProperties connectionProperties;
	
	@Test
	public void testYml(){
		System.out.println("Address: " + connectionProperties.getAddress());
		System.out.println("Password: " + connectionProperties.getPassword());
		System.out.println("Port: " + connectionProperties.getPort());
		System.out.println("UserName: " + connectionProperties.getUserName());
	}
}
