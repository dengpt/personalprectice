package com.dpt.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.dpt.springboot.bean.User;

public interface IUserService {

	public User findByFirstName(String firstName);
	public User saveUser(User user);
	public User insertUser(User user);
	public void deleteUser(User user);
	public List<User> findListByLastName(String lastName);
	public Page<User> findListByAgeGreaterThan(int age, int pageNumber, int pageSize, Sort sort);
	public Page<User> findUserList(int pageNumber, int pageSize, Sort sort);
	User findOne(User user);
}
