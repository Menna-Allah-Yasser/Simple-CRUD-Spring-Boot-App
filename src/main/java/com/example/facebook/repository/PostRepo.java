package com.example.facebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebook.entity.Post;

@Repository
public interface PostRepo  extends JpaRepository<Post, Long>{
	
	List<Post> findByUserId(Long id);

}
