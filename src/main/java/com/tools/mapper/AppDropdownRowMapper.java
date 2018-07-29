package com.tools.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tools.beans.AppDropdown;
import com.tools.beans.Tasks;

public class AppDropdownRowMapper implements RowMapper<AppDropdown> {

	@Override
	public AppDropdown mapRow(ResultSet rs, int row) throws SQLException {

		AppDropdown appDropdown = new AppDropdown();
		appDropdown.setId(rs.getInt("ID"));
		appDropdown.setDropdownName(rs.getString("DROPDOWN_NAME"));
		appDropdown.setDropdownKey(rs.getString("DROPDOWN_KEY"));
		appDropdown.setDropdownValue(rs.getString("DROPDOWN_VALUE"));
		appDropdown.setEnabled(rs.getString("ENABLED"));
		
		return appDropdown;
	}
}
