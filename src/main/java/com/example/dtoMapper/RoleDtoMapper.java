package com.example.dtoMapper;

import com.example.dto.RoleDto;
import com.example.entity.Role;

public class RoleDtoMapper {
	public static Role mapRoleDtoToRole(RoleDto roleDto) {
		Role role = new Role();
		role.setId(roleDto.getId());
		role.setRoleName(roleDto.getRoleName());
		return role;
	}
}
