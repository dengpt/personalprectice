package com.dpt.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dpt.springboot.bean.User;
import com.dpt.springboot.common.MongoPage;
import com.dpt.springboot.repository.UserRepository;
import com.dpt.springboot.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public User findByFirstName(String firstName) {
		return userRepository.findByFirstName(firstName);
	}
	@Override
	public User saveUser(User user){
		return userRepository.save(user);
	}
	@Override
	public void deleteUser(User user){
		userRepository.delete(user);
	}
	@Override
	public User insertUser(User user){
		return userRepository.insert(user);
	}
	@Override
	public List<User> findListByLastName(String lastName){
		return userRepository.findByLastName(lastName);
	}
	@Override
	public Page<User> findListByAgeGreaterThan(int age, int pageNumber, int pageSize, Sort sort){
		MongoPage page = new MongoPage(pageNumber - 1, pageSize, new Sort(Sort.Direction.DESC, "age"));
		Page<User> userPage = userRepository.findByAgeGreaterThan(age, page);
		return userPage;
	}
	@Override
	public Page<User> findUserList(int pageNumber, int pageSize, Sort sort) {
		MongoPage page = new MongoPage(pageNumber - 1, pageSize, new Sort(Sort.Direction.DESC, "age"));
		Page<User> userPage = userRepository.findAll(page);
		return userPage;
	}
}
