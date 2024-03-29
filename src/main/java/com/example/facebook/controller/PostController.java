package com.example.facebook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebook.entity.Post;
import com.example.facebook.repository.UserRepo;
import com.example.facebook.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;

	@GetMapping("/posts")
	public List<Post> getAllPosts() {
	    return postService.findAll();
	}

	@GetMapping("/posts/{id}")
	public Post getPostById(@PathVariable Long id) {
	    return postService.findById(id);
	}
	
	@GetMapping("/posts/users/{id}")
	public List<Post> findPostsByUserId(@PathVariable Long id){
		return postService.findPostsByUserId(id);
	}
	
	@PostMapping("/posts/add")
	public void addPost(Post post) {
		postService.addPost(post);
	}
	
	@PutMapping("/posts/update")
	public Post updatePost(Post newPost) {
		return postService.updatePost(newPost);
	}
	
	@DeleteMapping("/posts/delete/{id}")
	public void deletePost(@PathVariable Long id) {
		postService.deletePost(id);
	}

}
