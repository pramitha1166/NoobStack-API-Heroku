package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

@Service
public class PersonService {
	
	private PersonDao personDao;
	 
	@Autowired
	public void setPersonDao(@Qualifier("fakeDao") PersonDao personDao) {
		this.personDao = personDao;
	}


	public int addPerson(Person person) {
		
		return personDao.insertPerson(person);
	}
	
	public List<Person> getAllPeople(){
		
		return personDao.selectAllPeople();
		
	}
	
	public Optional<Person> getPersonById(UUID id){
		
		return personDao.selectPersonById(id);
		
	}
	
	public int deletePeson(UUID id) {
		
		return personDao.deletePersonById(id);
		
	}
	
	public int updatePerosn(UUID id , Person newPerson) {
		
		return personDao.updatePersonById(id, newPerson);
	}

}
