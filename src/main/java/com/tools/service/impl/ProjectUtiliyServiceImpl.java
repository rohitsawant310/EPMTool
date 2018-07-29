package com.tools.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tools.beans.AppDropdown;
import com.tools.beans.Tasks;
import com.tools.dao.ProjectUtiliyDao;
import com.tools.dao.UserDetailsDao;
import com.tools.service.ProjectUtiliyService;

@Service
public class ProjectUtiliyServiceImpl implements ProjectUtiliyService {

	@Autowired
	private ProjectUtiliyDao projectUtilityDao;
	
	@Override
	public List<AppDropdown> getAllAppDropdown() {
		return projectUtilityDao.getAllAppDropdown();
	}

	@Override
	public AppDropdown getDropdownByName(String dropDownName) {
		return projectUtilityDao.getDropdownByName(dropDownName);
	}

	@Override
	public Integer calculatePointsForTask(Tasks task) {
		
		Integer pointsCalculated=0;
		if(task.getTaskClosedDate()!=null && task.getTaskStartDate() !=null && task.getTaskCommitDate()!=null) {
			long diffDays=(task.getTaskClosedDate().getTime() - task.getTaskStartDate().getTime())/ (1000 * 60 * 60 * 24);
			long diffPlusDays=(task.getTaskClosedDate().getTime() - task.getTaskCommitDate().getTime())/ (1000 * 60 * 60 * 24);
			
			System.out.println("diffDays"+diffDays);
			System.out.println("diffPlusDays"+diffPlusDays);
			pointsCalculated=(int) (diffDays*10+diffPlusDays*10);
		}
		return pointsCalculated;
	}
}
