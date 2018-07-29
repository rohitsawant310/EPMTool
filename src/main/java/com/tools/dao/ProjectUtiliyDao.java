package com.tools.dao;

import java.util.List;

import com.tools.beans.AppDropdown;

public interface ProjectUtiliyDao {

	public List<AppDropdown> getAllAppDropdown();
	public AppDropdown getDropdownByName(String dropDownName);
	
}
