package com.example.demo.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RequestMapping("NoobStack/api/users")
@RestController
@CrossOrigin(origins="*")
public class PersonController {
	
	private PersonService personService;

	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	@PostMapping
	public void addPerson(@RequestBody Person person) {
		
		personService.addPerson(person);
		
	} 
	
	@GetMapping
	public List<Person> getAllPeople(){
		
		return personService.getAllPeople();
		
	}
	
	@GetMapping(path = "/{id}")
	public Person getPersonById(@PathVariable("id") UUID id) {
		
		return personService.getPersonById(id)
				.orElse(null);
				
	}
	
	@DeleteMapping(path = "/{id}")
	public void deletePersonById(@PathVariable("id") UUID id) {
		
		personService.deletePeson(id);
		
	}
	
	@PutMapping(path = "/{id}")
	public void updatePerson(@PathVariable("id") UUID id,  @RequestBody Person personToUpdate) {
		
		personService.updatePerosn(id, personToUpdate);
		
	}
	
	

}
