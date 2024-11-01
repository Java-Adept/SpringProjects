package com.binary.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.binary.spring.entity.AppUser;

public interface UserRepository extends  JpaRepository<AppUser, Integer> {

	public AppUser findByEmail(String email);
	
	public AppUser findByUserName(String userName);
}
