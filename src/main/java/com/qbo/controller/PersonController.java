package com.qbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qbo.model.Person;
import com.qbo.service.PersonService;

@RestController
@RequestMapping("/apiqbo/v1") //localhost:8080/apiqbo/v1/persons
public class PersonController {

	@Autowired
	PersonService personService;
	
	@GetMapping("/persons")
	public List<Person> getAllPersons(){
		return personService.getAllPersons();
	}
	
	
}
