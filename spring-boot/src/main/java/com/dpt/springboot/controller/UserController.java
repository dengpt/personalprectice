package com.dpt.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dpt.springboot.bean.User;
import com.dpt.springboot.exception.SpringBootException;
import com.dpt.springboot.service.IUserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private IUserService userServiceImpl;
	
	@RequestMapping(value = "/{firstName}", method = RequestMethod.GET)
	public User getUserByFirstName(@PathVariable("firstName") String firstName){
		User user = new User();
		user = userServiceImpl.findByFirstName(firstName);
		return user;
	}
	@RequestMapping(value = "/{firstName}", method = RequestMethod.POST)
	public User createUser(User user ){
		System.out.println(user);
		user = userServiceImpl.insertUser(user);
		return user;
		
	}
	@RequestMapping(value = "/{firstName}", method = RequestMethod.PUT)
	public User updateUserByFirstName(User user){
		System.out.println(user);
		user = userServiceImpl.saveUser(user);
		return user;
	}
	@RequestMapping(value = "/{firstName}", method = RequestMethod.DELETE)
	public User deleteUserByFirstName(@PathVariable("firstName") String firstName){
		User user = new User();
		user = userServiceImpl.findByFirstName(firstName);
		System.out.println("删除：" + firstName);
		userServiceImpl.deleteUser(user);
		return user;
	}
	@RequestMapping(value = "/{pageSize}/{pageNumber}", method = RequestMethod.GET)
	public Page<User> allUsers(@PathVariable("pageSize") int pageSize, @PathVariable("pageNumber") int pageNumber){
		return userServiceImpl.findUserList(pageNumber, pageSize, new Sort(Sort.Direction.DESC, "age"));
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public User getUser(User user){
		System.out.println(user);
		user = userServiceImpl.findOne(user);
		return user;
	}
	
	@RequestMapping(value = "/advice", method = RequestMethod.GET)
	public String testError(){
		if(2 != 1){
			throw new SpringBootException("123","2 != 1");
		}
		
		return "/errow";
	}
}
