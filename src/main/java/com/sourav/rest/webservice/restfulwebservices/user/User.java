package com.sourav.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {

	
	private Integer id;
	
	@Size(min = 2, message = "Name should have atleast two characters")
	private String name;
	
	@Past
	private Date birthDate;

	public User(Integer id, String name, Date birthDate) {
		super();
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
