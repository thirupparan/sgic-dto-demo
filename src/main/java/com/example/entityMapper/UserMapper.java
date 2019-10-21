package com.example.entityMapper;

import java.util.ArrayList;
import java.util.List;

import com.example.dto.RoleDto;
import com.example.dto.UserDtoResponse;
import com.example.entity.User;

public class UserMapper {

	public static UserDtoResponse mapUserToUserDto(User user) {
		UserDtoResponse userDtoResponse = new UserDtoResponse();
		userDtoResponse.setId(user.getId());
		userDtoResponse.setUserName(user.getUserName());
		userDtoResponse.setEmail(user.getEmail());

		RoleDto role = new RoleDto();
		role.setId(user.getRole().getId());
		role.setRoleName(user.getRole().getRoleName());

		userDtoResponse.setRole(role);
		userDtoResponse.setPassword(user.getPassword());
		return userDtoResponse;
	}

	public static List<UserDtoResponse> mapUserListToUserDtoList(List<User> userList) {
		List<UserDtoResponse> userDtoList = new ArrayList<UserDtoResponse>();
		if (userList != null) {
			for (User user : userList) {
				userDtoList.add(mapUserToUserDto(user));
			}
		}
		return userDtoList;

	}
}
