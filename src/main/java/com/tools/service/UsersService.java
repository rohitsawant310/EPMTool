package com.tools.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tools.beans.UserDetails;

@Service("UsersService")
public interface  UsersService {
	
	public UserDetails getUserDetails(String userId);
	
	public UserDetails getUserDetailsbyFirstName(String userName);
	
	public UserDetails getUserDetailsbyOrganization(String orgName);

	public List<UserDetails> getAllUserDetails();

	public int addUserDetails(UserDetails userDetails);

	public int updateUserDetails(UserDetails userDetails);

	public int deleteUserDetails(String userId);

}
