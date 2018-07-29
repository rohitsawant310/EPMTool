package com.tools.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tools.beans.AppDropdown;
import com.tools.beans.Tasks;
import com.tools.beans.UserDetails;
import com.tools.dao.ProjectUtiliyDao;
import com.tools.mapper.AppDropdownRowMapper;
import com.tools.mapper.TaskDetailsRowMapper;
import com.tools.mapper.UserDetailsRowMapper;

@Service
public class ProjectUtiliyDaoImpl implements ProjectUtiliyDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Transactional
	
	@Override
	public List<AppDropdown> getAllAppDropdown() {
		List<AppDropdown> appDropDown =(List<AppDropdown>) jdbcTemplate.query("SELECT * FROM APP_DROPDOWN", new AppDropdownRowMapper());
		return appDropDown;
	}

	@Override
	public AppDropdown getDropdownByName(String dropDownName) {

		AppDropdown appDropdown = (AppDropdown) jdbcTemplate.queryForObject(
				"SELECT * FROM APP_DROPDOWN WHERE DROPDOWN_NAME = ?", new Object[] { dropDownName }, new AppDropdownRowMapper());		
		return appDropdown;
	}

}
