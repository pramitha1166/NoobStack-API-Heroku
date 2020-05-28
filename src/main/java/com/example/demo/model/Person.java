package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	
	private final UUID id;
	private final String  name;
	private final String  lastname;
	private final String  email;
	private final String  password;
	
	public Person(@JsonProperty("id") UUID id,
				  @JsonProperty("name") String name,
				  @JsonProperty("lastname") String lastname,
				  @JsonProperty("email") String email,
				  @JsonProperty("password") String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
}
