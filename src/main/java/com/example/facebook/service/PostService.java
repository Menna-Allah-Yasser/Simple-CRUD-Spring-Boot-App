package com.example.facebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebook.entity.Post;
import com.example.facebook.entity.User;
import com.example.facebook.repository.PostRepo;

@Service
public class PostService {
	
	@Autowired
	private PostRepo postRepo;

	public List<Post> findAll() {
		return (List<Post>) postRepo.findAll();
	}

	public Post findById(Long id) {
		return postRepo.findById(id).orElseThrow();
	}
	
	public List<Post> findPostsByUserId(Long id){
		return postRepo.findByUserId(id);
	}
	
	public void addPost(Post post) {
		postRepo.save(post);
	}
	
	public Post updatePost(Post newPost) {
		Post oldPost = findById(newPost.getId());
		
		if(newPost.getPostDate()==null) {
			newPost.setPostDate(oldPost.getPostDate());
		}
		
		if(newPost.getDetails()==null) {
			newPost.setDetails(oldPost.getDetails());
		}
		
		if(newPost.getUser()==null) {
			newPost.setUser(oldPost.getUser());
		}
		
		return postRepo.save(newPost);
	}

	public void deletePost(Long id) {
		postRepo.deleteById(id);
		
	}

}
