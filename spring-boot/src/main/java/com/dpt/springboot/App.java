package com.dpt.springboot;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * 
 * @author uisftech
 *
 */
// 其中@SpringBootApplication申明让springboot自动给程序进行必要的配置，
// 等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(App.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}
}
