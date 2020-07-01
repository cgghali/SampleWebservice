package com.ghali.webservices.dao;

import java.util.List;

import com.ghali.webservices.enity.UserData;

public interface WebServiceDao {

	int storeUser(UserData user);

	List<UserData> getUsers();

}
