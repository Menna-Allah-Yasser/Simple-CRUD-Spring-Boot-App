package com.example.facebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.facebook.entity.User;
import com.example.facebook.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;

	public List<User> getAllUsers() {
		return (List<User>) userRepo.findAll();
	}

	public User getUserById(Long id) {
		return userRepo.findById(id).orElseThrow();
	}

	public List<User> findUsersByLocationId(Long id){
		return userRepo.findByLocationId(id);
	}
	
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	public User updateUser(User newUser) {
		
		User oldUser=getUserById(newUser.getId());
		
		if(newUser.getEmail()==null) {
			newUser.setEmail(oldUser.getEmail());
		}
		
		if(newUser.getFirstName()==null) {
			newUser.setFirstName(oldUser.getFirstName());
		}
		
		if(newUser.getLastName()==null) {
			newUser.setLastName(oldUser.getLastName());
		}
		
		if(newUser.getLocation()==null) {
			newUser.setLocation(oldUser.getLocation());
		}
		
		if(newUser.getPosts()==null) {
			newUser.setPosts(oldUser.getPosts());
		}
		return userRepo.save(newUser);
		
	}

	public void deleteUser(Long id) {
		userRepo.deleteById(id);
	}

}
