package com.ankamma.user.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankamma.user.application.feign.UserClient;
import com.ankamma.user.application.model.UserExit;
import com.ankamma.user.application.model.UserList;
import com.ankamma.user.application.model.UserRequest;
import com.ankamma.user.application.model.UserResponse;

@Service
public class UserService {
	@Autowired
	UserClient userClient;

	public UserResponse createUser(UserRequest userRequest) {

		return userClient.createUser(userRequest);
	}

	public UserExit existsByUsername(String username) {
	
		return userClient.checkUserExit(username);
		
		
	}

	public UserExit existsByEmail(String email) {
		return userClient.checkEmailExit(email);
	}

	public UserList getUserNames(String username) {

		return userClient.getUserNames(username);
	}

	public List<UserList> getUserList() {
		return userClient.getUserList();
	}

}
