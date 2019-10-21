package com.example.service;

import java.util.List;

import com.example.entity.Role;
import com.example.entity.User;


public interface UserService {
	User addUser(User user,Role role);
	List<User> viewAllUser();
}
