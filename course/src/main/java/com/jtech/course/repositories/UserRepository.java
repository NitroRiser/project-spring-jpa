package com.jtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
