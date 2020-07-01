package com.ghali.webservices.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ghali.webservices.dao.WebServiceDaoImpl;
import com.ghali.webservices.enity.UserData;

@RestController
public class RestUserController {
	private static final Logger log = LoggerFactory.getLogger(RestUserController.class);

	@Autowired
	private WebServiceDaoImpl webServiceDaoImpl;

	@GetMapping(value = "/api/v1/users", produces = "application/json")
	List<UserData> getString() {
		log.info("Get All Users api called");
		return webServiceDaoImpl.getUsers();

	}

	@PostMapping(value = "/api/v1/adduser", produces = "application/json")
	public int createUser(@Validated @RequestBody UserData user) {
		log.info("Add user api called");
		return webServiceDaoImpl.storeUser(user);
	}

}
