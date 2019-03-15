package com.example.demo.controller;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.*;
import com.example.demo.repository.UserRepository;
@RestController
public class UserController {
    @Autowired
	private UserRepository userRepository;
    @PostConstruct	
	public void saveUser()
	{
		List<User> user = new ArrayList<>();
		user.add(new User(1,"Udit"));
		user.add(new User(2,"Joshi"));
		userRepository.saveAll(user);
		
}
    @GetMapping("/users")
    public List<User> getAllUser()
    {
    	return userRepository.findAll();
    }
    
    
}