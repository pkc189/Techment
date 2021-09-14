package com.exam.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repository.RoleRepository;
import com.exam.repository.UserRepository;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {

//check before inserting
	User local =	this.userRepository.findByUsername(user.getUsername());
		if(local!=null)
		{
			System.out.println("user is already present");
			throw new Exception("user already exist");
		}
		else {
			for(UserRole ur:userRoles)
			{
				//saving each role in database here
				roleRepository.save(ur.getRole());
			}
			
			//user associate ho gya saare roles se
			user.getUserRoles().addAll(userRoles);
			
			// iske baad user ko save kar de
			
			local =userRepository.save(user);
		}
		
		return local;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long id) {

this.userRepository.deleteById(id);
		
	}

	@Override
	public User updateUser(String username, User user) {

		User old = this.userRepository.findByUsername(username);
		
		old.setFirstName(user.getFirstName());
		old.setEmail(user.getEmail());
		old.setLastName(user.getLastName());
		old.setPhone(user.getPhone());
		old.setProfile(user.getProfile());
		
		
		

		return this.userRepository.save(old);
	}

	
}
