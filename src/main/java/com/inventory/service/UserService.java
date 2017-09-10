package com.inventory.service;

import com.inventory.model.User;

import java.util.List;

public interface UserService {
	User findUserByEmail(String email);
	void saveUser(User user);
	List<User> findAll();

}
