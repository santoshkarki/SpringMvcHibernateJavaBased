package com.codejava.spring.service;

import java.util.List;

import com.codejava.spring.model.User;

public interface UserService {
	public List<User> list();
	
	public User get(int id);
	
	public void saveOrUpdate(User user);
	
	public void delete(int id);
}