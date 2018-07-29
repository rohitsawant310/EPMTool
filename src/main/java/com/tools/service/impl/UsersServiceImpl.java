package com.tools.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tools.beans.UserDetails;
import com.tools.dao.UserDetailsDao;
import com.tools.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UserDetailsDao userDetailsDao;
	
	@Override
	public UserDetails getUserDetails(String userId) {
		return userDetailsDao.getUserDetails(userId);
	}
	
	@Override
	public List<UserDetails> getAllUserDetails() {
		return userDetailsDao.getAllUserDetails();
	}

	@Override
	public int addUserDetails(UserDetails userDetails) {
		return userDetailsDao.addUserDetails(userDetails);
	}

	@Override
	public int updateUserDetails(UserDetails userDetails) {
		return userDetailsDao.updateUserDetails(userDetails);
	}

	@Override
	public int deleteUserDetails(String userId) {
		return userDetailsDao.deleteUserDetails(userId);
	}

	public UserDetailsDao getUserDetailsDao() {
		return userDetailsDao;
	}

	@Override
	public UserDetails getUserDetailsbyFirstName(String firstName) {
		return userDetailsDao.getUserDetailsbyFirstName(firstName);
	}

	@Override
	public UserDetails getUserDetailsbyOrganization(String orgName) {
		// TODO Auto-generated method stub
		return userDetailsDao.getUserDetailsbyOrganization(orgName);
	}
}
