package com.jsproject.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsproject.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UseResource {

	//método que responde requisicão http
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Janaina pires", "pires@gmail.com", "10111213", "123456");
		return ResponseEntity.ok().body(u);
	}
	
	
}
