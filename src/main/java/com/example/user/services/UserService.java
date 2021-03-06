package com.example.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public String createUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser.getId();
	}
}
