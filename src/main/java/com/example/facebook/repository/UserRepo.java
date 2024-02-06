package com.example.facebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebook.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	
	List<User> findByLocationId(Long id);

}
