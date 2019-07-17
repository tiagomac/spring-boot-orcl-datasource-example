package com.github.tiagomac.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Table(schema="TEST", name="PERSON")
@Entity
@Data
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SG_SEQ_PERSON_ID")
	@SequenceGenerator(name = "SG_SEQ_PERSON_ID", sequenceName = "TEST.SEQ_PERSON_ID")
	private Long id;
	
	@Column
	private String name;

}
