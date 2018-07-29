package com.tools.dao;

import java.util.List;

import com.tools.beans.UserDetails;

public interface UserDetailsDao {
	
	public UserDetails getUserDetails(String userId);
	
	public UserDetails getUserDetailsbyFirstName(String userName);
	
	public UserDetails getUserDetailsbyOrganization(String orgName);

	public List<UserDetails> getAllUserDetails();

	public int addUserDetails(UserDetails userDetails);

	public int updateUserDetails(UserDetails userDetails);

	public int deleteUserDetails(String userId);
		
}
