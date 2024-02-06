package com.example.facebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebook.entity.Post;
import com.example.facebook.repository.PostRepo;

@Service
public class PostService {
	
	@Autowired
	private PostRepo postRepo;

	public List<Post> findAll() {
		return (List<Post>) postRepo.findAll();
	}

	public Optional<Post> findById(Long id) {
		return postRepo.findById(id);
	}

}
