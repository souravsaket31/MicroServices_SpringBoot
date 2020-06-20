package com.sourav.rest.webservice.restfulwebservice;

public class HelloWorldBean {
	private String message;

	public HelloWorldBean() {
		super();
	}

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
