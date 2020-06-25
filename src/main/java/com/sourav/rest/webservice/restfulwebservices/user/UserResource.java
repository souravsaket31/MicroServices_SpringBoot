
package com.sourav.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * This class is a User Controller class
 */

@RestController
public class UserResource {

	@Autowired
	UserDaoService service;
	
	@GetMapping("/users")
	public List<User> retieveAllusers()
	{
	
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retieveUser(@PathVariable int id)
	{
	
		return service.findOne(id);
	}
	
	 // input - details of user
	 // output - CREATED & Return the created URI
	 @PostMapping("/users")
	 public ResponseEntity<User> createUser(@RequestBody User user){
	 User savedUser = service.save(user);
	 
	 URI location = 
			 ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
	 
	 
	 return ResponseEntity.created(location).build();
	 } 
	
}
