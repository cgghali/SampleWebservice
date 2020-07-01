package com.ghali.webservices.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ghali.webservices.enity.UserData;
import com.ghali.webservices.repository.UserRepository;

@Component
public class WebServiceDaoImpl implements WebServiceDao {

	@Autowired
	private UserRepository userRepository;
	@Override
	public int storeUser(UserData user) {
		userRepository.save(user);
		return 1;
	}
	@Override
	public List<UserData> getUsers() {
		return userRepository.findAll();
	}


}
