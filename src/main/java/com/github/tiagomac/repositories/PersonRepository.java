package com.github.tiagomac.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.tiagomac.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

	

}
