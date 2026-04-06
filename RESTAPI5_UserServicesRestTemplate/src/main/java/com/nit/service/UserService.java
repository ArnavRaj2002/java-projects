package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.User;
import com.nit.repo.IUserRepository;
@Service
public class UserService {
	@Autowired
	private IUserRepository userRepo;
public String	addUser(User u)
	{
	 Integer userId = userRepo.save(u).getUserId();	 
	 return "user saved having ID::"+userId;
	}

public User	getUser(Integer userId)
	{
		return  userRepo.findById(userId).get();
		
	}

public List<User>	getAllUsers()
{
	return userRepo.findAll();
	
}

}
