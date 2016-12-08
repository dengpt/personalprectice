package com.dpt.springboot.configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dpt.springboot.App;
import com.dpt.springboot.properties.FooComponent;
import com.dpt.springboot.properties.YmlConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)  
@SpringBootTest(classes = App.class)  
public class ReadApplicationYmlTests {  
    @Autowired  
    private YmlConfig ymlConfig;  
    @Autowired
    private FooComponent fooComponent;
    @Test  
    public void testDisplayYmlValue() throws JsonProcessingException {  
        System.out.println("simpleProp: " + ymlConfig.getSimpleProp());    
          
        ObjectMapper objectMapper = new ObjectMapper();  
        System.out.println("arrayProps: " + objectMapper.writeValueAsString(ymlConfig.getArrayProps()));    
        System.out.println("listProp1: " + objectMapper.writeValueAsString(ymlConfig.getListProp1()));    
        System.out.println("listProp2: " + objectMapper.writeValueAsString(ymlConfig.getListProp2()));    
        System.out.println("mapProps: " + objectMapper.writeValueAsString(ymlConfig.getMapProps()));    
  System.out.println("=====================================================================");
  System.out.println("foo.ds.name: " + fooComponent.getName());
  System.out.println("foo.ds.age: " + fooComponent.getAge());
    }  
}
