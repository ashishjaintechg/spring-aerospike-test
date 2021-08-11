package test.ashishjaintechg.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.ashishjaintechg.repo.User;
import test.ashishjaintechg.repo.UserRepository;

@RestController
@RequestMapping("test/users")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping(path="/{id}")
	public User findById(@PathVariable("id") Integer id) {
		return userRepository.findById(id).get();
	}
	
	@PostMapping
	public User create(@RequestBody User user) {
		return userRepository.save(user);
	}

}
