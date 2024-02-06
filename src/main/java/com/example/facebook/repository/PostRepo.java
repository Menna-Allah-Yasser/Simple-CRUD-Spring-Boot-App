package com.example.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebook.entity.Post;

@Repository
public interface PostRepo  extends JpaRepository<Post, Long>{

}
