package com.example.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebook.entity.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location, Long> {

}
