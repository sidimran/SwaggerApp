package com.techprimers.springboot.resource;

import java.util.Arrays;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

@RestController
@RequestMapping("/rest/user")
@Api(value = "user Resource REST Endpoint",  description = "Shows the user Info")
public class UserResource {

	@GetMapping
	public List<User> getUser(){
		
		return Arrays.asList(
				new User("Peter", 2001),
				new User("Sam",3400)
				);	
	}
	
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String userName) {
		 return new User(userName, 1000L);
	}

	
	private class User {
		@ApiModelProperty(notes = "Name of the user")
		private String userName;
		
		@ApiModelProperty(notes = "Employee Salary")
		private Long salary;

		public User(String userName, long salary) {
			this.userName = userName;
			this.salary = salary;
		}

		public String getUserName() {
			return userName;
		}

		public void setuserName(String userName) {
			this.userName = userName;
		}

		public Long getSalary() {
			return salary;
		}

		public void setSalary(Long salary) {
			this.salary = salary;
		}

	}

}
