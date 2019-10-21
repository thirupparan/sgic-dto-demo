package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.repository.RoleRepository;
import com.example.service.RoleService;


@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleRepository roleRepository;
	@Override
	public Role addRole(Role role) {
		if (role != null) {
			return roleRepository.save(role);
		}
		return null;
	}

	@Override
	public List<Role> viewAllRole() {
		return roleRepository.findAll();
	}

	@Override
	public Role findRoleById(Long id) {
		return roleRepository.findRoleById(id);
	}

}
