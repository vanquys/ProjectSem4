package com.aptech.ProjectSem4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aptech.ProjectSem4.entities.Users;
import com.aptech.ProjectSem4.repositories.UserRepository;

@Controller

public class UsersController {
	private final UserRepository userRepository;
	public List<Users> listUser() {
		Object list = userRepository.findAll();
		List<Users> li = (List<Users>)list;
		return li;
	}
    @Autowired
	public UsersController(UserRepository repository) {
		this.userRepository = repository;
	}
    @Autowired

    @GetMapping("/login")
    public String login() {
        return "login"; 
    }
    
    @Autowired
	@GetMapping("/users") 
	public List<Users> getAllUsers() { 
		return userRepository.findAll(); }

}
