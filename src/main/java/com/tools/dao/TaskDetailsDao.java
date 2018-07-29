package com.tools.dao;

import java.util.List;
import java.util.Map;

import com.tools.beans.Tasks;

public interface TaskDetailsDao {

	public int addNewTask(Tasks task);
	public List<Tasks> getAllTasks();
	public Tasks getTaskByName(String taskName);
	public Tasks getTaskById(Integer taskId);
	public Map<String,Integer> getTaskStats();
	public Map<String,Integer> getTotalTasksDayWise();
	public Map<String,Integer> getTaskWiseTotalWork();	
}
