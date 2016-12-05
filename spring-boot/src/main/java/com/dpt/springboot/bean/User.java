package com.dpt.springboot.bean;

import org.springframework.data.annotation.Id;

public class User {
	@Id
    private String id;

	public String firstName;
    public String lastName;
    private int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User() {
		super();
	}
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public User(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
    public String toString() {
        return String.format(
                "User[id=%s, firstName='%s', lastName='%s', age='%s']",
                id, firstName, lastName, age);
    }
}
