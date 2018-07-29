package com.tools.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.tools.beans.AppDropdown;
import com.tools.beans.Tasks;

@Service("ProjectUtiliyService")
public interface ProjectUtiliyService {

	public List<AppDropdown> getAllAppDropdown();
	public AppDropdown getDropdownByName(String dropDownName);
	public Integer calculatePointsForTask(Tasks task);
}
