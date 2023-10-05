package com.velocity.ec.serviceimpl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.velocity.ec.dto.SucessDto;
import com.velocity.ec.dto.UserLoginDto;
import com.velocity.ec.model.User;
import com.velocity.ec.repository.UserRepository;
import com.velocity.ec.response.LoginResponse;
import com.velocity.ec.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	@Override
	public SucessDto loginUser(UserLoginDto userlogindto) {
		SucessDto sucessdto = new SucessDto();
		// TODO Auto-generated method stub
		String msg = "";
		String userpassword = userlogindto.getPassword();
		User user1 = userRepository.findByEmail(userlogindto.getEmail());
		if (user1 != null) {
			if (user1.getPassword().equals(userpassword)) {

				User user = userRepository.findUserByEmailAndPassword(userlogindto.getEmail());
				if (Objects.nonNull(user1)) {
					sucessdto.setMessage("login sucessfull!");
					sucessdto.setStatus("Success");
					sucessdto.setStatusCode(HttpStatus.OK.value());
					sucessdto.setTimestamp(new Timestamp(new Date().getTime()));
				} else {

					sucessdto.setMessage(" either emailid or password does not match!");

					sucessdto.setStatus("Fail");
					sucessdto.setStatusCode(HttpStatus.BAD_REQUEST.value());
					sucessdto.setTimestamp(new Timestamp(new Date().getTime()));
				}
			}
		} else if (user1 == null) {

			sucessdto.setMessage(" user does not exist");

			sucessdto.setStatus("Fail");
			sucessdto.setStatusCode(HttpStatus.BAD_REQUEST.value());
			sucessdto.setTimestamp(new Timestamp(new Date().getTime()));
		}

		return sucessdto;

	}

}
