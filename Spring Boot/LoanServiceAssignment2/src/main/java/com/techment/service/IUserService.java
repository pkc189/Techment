package com.techment.service;

import java.util.Optional;

import com.techment.dto.UserDto;

public interface IUserService {

	UserDto login(String username,String password);
	UserDto register(String username,String password);
	Optional<UserDto> findByToken1(String token);
}
