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

import com.example.dto.UserDtoRequest;
import com.example.dto.UserDtoResponse;
import com.example.dtoMapper.UserDtoMapper;
import com.example.entityMapper.UserMapper;
import com.example.service.RoleService;
import com.example.service.UserService;




@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	
	@PostMapping
	public ResponseEntity<?> craeteUser(@RequestBody UserDtoRequest userDtoRequest) {
		return new ResponseEntity<>(UserMapper.mapUserToUserDto( 
				userService.addUser(
				UserDtoMapper.mapUserDtoToUser(userDtoRequest),
				roleService.findRoleById(userDtoRequest.getRole())
				)), HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<List<UserDtoResponse>> getUsers() {
		return new ResponseEntity<>(UserMapper.mapUserListToUserDtoList(userService.viewAllUser()), HttpStatus.OK);
	}
}
