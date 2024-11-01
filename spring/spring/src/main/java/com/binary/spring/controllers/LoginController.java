package com.binary.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.binary.spring.dto.SignUpRequest;
import com.binary.spring.entity.AppUser;
import com.binary.spring.repository.UserRepository;

@RestController
public class LoginController {
	
	@Autowired
	UserRepository repository;
	
	@GetMapping("/welcome")
	public String message() {
		return "Hello , This is from welcome messsage method";
	}
	
	@PostMapping("/signup")
	public ResponseEntity<Object> signUp(@RequestBody SignUpRequest signup) {
		
		
		AppUser user=new AppUser();
		user=repository.findByEmail(signup.getEmail());
		if(user!=null) {
			return ResponseEntity.badRequest().body("User email already Exist Please user different email");
		}
		
		user=repository.findByUserName(signup.getUserName());
		if(user!=null) {
			return ResponseEntity.badRequest().body("UserName already Exist Please user different userName");
		}
		
		user.setFirstName(signup.getFirstName());
		user.setLastName(signup.getLastName());
		user.setAddress(signup.getAddress());
		user.setEmail(signup.getEmail());
		user.setUserName(signup.getUserName());
		user.setPassword(signup.getPassword());
		user.setPhone(signup.getPhone());
		
		repository.save(user);
		
		return ResponseEntity.ok(user);
		
	}
	

}
