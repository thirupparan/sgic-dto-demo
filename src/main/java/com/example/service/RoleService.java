package com.example.service;

import java.util.List;

import com.example.entity.Role;

public interface RoleService {
	Role addRole(Role role);
	List<Role> viewAllRole();
	Role findRoleById(Long id);
}
