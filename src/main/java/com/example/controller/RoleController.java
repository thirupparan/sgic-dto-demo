package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.RoleDto;
import com.example.dtoMapper.RoleDtoMapper;
import com.example.entityMapper.RoleMapper;
import com.example.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	RoleService roleService;

	@GetMapping
	public ResponseEntity<List<RoleDto>> getRole() {
		return new ResponseEntity<>(RoleMapper.mapRoleListToRoleDtoList(roleService.viewAllRole()), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> addRole(@RequestBody RoleDto roleDto) {
		return new ResponseEntity<>(
				RoleMapper.mapRoleToRoleDto(roleService.addRole(RoleDtoMapper.mapRoleDtoToRole(roleDto))),
				HttpStatus.CREATED);

	}
}
