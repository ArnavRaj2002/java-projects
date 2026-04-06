package com.nit.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class UserService {
	@Autowired
	private CacheService service;
	public void addUser(String userName, String pName)
	{
		service.put(userName, pName);
	}
	public void getUser(String key) 
	{
		service.get(key);
	}
}
