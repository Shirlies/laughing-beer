package com.beer.user.vainner.service;


import org.junit.Test;
import com.beer.user.vainner.model.User;


public class UserServiceTest {

	@Test
	public void testAdd() {
		UserService userService = new UserService();
		User user = new User();
		user.setFirstName("1");
		user.setLastName("2");
		user.setGender("3");
		user.setPassword("4");
		user.setStudentId("5");
		user.setUsername("6");
		user.setPlayGameTimes(1);
		userService.add(user);
	}

}
