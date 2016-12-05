package com.dpt.springboot.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.dpt.springboot.bean.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByFirstName(String firstName);
	public List<User> findByLastName(String lastName);
	public Page<User> findByAgeGreaterThan(int age, Pageable page);
}
