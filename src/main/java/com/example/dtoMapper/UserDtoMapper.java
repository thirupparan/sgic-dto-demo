package com.example.dtoMapper;

import com.example.dto.UserDtoRequest;
import com.example.entity.User;

public class UserDtoMapper {
	public static User mapUserDtoToUser(UserDtoRequest userDtoRequest) {
		User user = new User();
		user.setId(userDtoRequest.getId());
		user.setUserName(userDtoRequest.getUserName());
		user.setEmail(userDtoRequest.getEmail());
		user.setPassword(userDtoRequest.getPassword());
		return user;

	}
}
