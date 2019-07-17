package com.github.tiagomac.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.github.tiagomac.domain.Person;
import com.github.tiagomac.repositories.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repo;
	
	public Person insert(Person person) {
		return repo.save(person);
	}
	
	public Page<Person> findAll(Pageable pageable){
		return repo.findAll(pageable);
	}

}
