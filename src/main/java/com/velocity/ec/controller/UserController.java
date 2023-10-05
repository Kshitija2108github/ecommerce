package com.velocity.ec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.ec.dto.SucessDto;
import com.velocity.ec.dto.UserLoginDto;
import com.velocity.ec.model.User;
import com.velocity.ec.service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	@ApiOperation(value = "This method is used to save the user details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "ok"), @ApiResponse(code = 404, message = "not found") })
	public User saveUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return user1;
	}

	@PostMapping("/login")
	public SucessDto userLogin(@RequestBody UserLoginDto userlogindto) {

		return userService.loginUser(userlogindto);

	}
}
