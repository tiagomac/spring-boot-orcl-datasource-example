package com.github.tiagomac.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.tiagomac.domain.Person;
import com.github.tiagomac.services.PersonService;

@RestController
public class PersonResource {
	
	@Autowired
	private PersonService service;
	
	@PostMapping("/person")
	public ResponseEntity<Person> insert(@RequestBody Person person) {
		return ResponseEntity.ok(service.insert(person));
	}
	
	@GetMapping("/person")
	public HttpEntity<Page<Person>> findAll(@PageableDefault Pageable pageable){
		return ResponseEntity.ok(service.findAll(pageable));
	}

}
