package com.example.facebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebook.entity.User;
import com.example.facebook.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public List<User> getAllUsers() {
		return (List<User>) userRepo.findAll();
	}

	public Optional<User> getUserById(Long id) {
		return userRepo.findById(id);
	}

}
