package com.educandoweb.workshopmongo2.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.workshopmongo2.domain.User;
//import com.educandoweb.workshopmongo2.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//@Autowired 
	//private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria Valentina", "maria@gmail.com");
		User jose = new User("2", "Jose Vitor", "jose@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, jose));
		return ResponseEntity.ok().body(list);
	}
}
