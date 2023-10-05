package com.velocity.ec.service;

import com.velocity.ec.dto.SucessDto;
import com.velocity.ec.dto.UserLoginDto;
import com.velocity.ec.model.User;
import com.velocity.ec.response.LoginResponse;

public interface UserService {

	public User saveUser(User user);

	public SucessDto loginUser(UserLoginDto userlogindto);

}
