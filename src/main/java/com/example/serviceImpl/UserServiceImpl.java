package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.entity.User;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;

	@Override
	public User addUser(User user, Role role) {
		if (user != null) {
			user.setRole(role);
			return userRepository.save(user);
		}
		return null;
	}

	@Override
	public List<User> viewAllUser() {
		return userRepository.findAll();
	}

}
