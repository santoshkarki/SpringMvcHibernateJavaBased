package com.codejava.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codejava.spring.dao.UserDAO;
import com.codejava.spring.dao.UserDAOImpl;
import com.codejava.spring.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;

	UserServiceImpl(){}
	

	public UserServiceImpl(UserDAOImpl userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public List<User> list() {
		List<User> listUser = userDao.list();
		return listUser;
	}

	@Override
	@Transactional
	public void saveOrUpdate(User user) {
		userDao.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	@Transactional
	public User get(int id) {
		return userDao.get(id);
}

	/*public UserDAOImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAOImpl userDao) {
		this.userDao = userDao;
	}*/
	
}