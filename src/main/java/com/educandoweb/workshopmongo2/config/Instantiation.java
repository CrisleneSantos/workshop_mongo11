package com.educandoweb.workshopmongo2.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.educandoweb.workshopmongo2.domain.User;
import com.educandoweb.workshopmongo2.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Override
	
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Valentina", "maria@gmail.com");
		User jose = new User(null, "Jose Vitor", "jose@gmail.com");
		User fabio = new User(null, "Fabio Taylor", "fabio@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, jose, fabio));
	}

}
