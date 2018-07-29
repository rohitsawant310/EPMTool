package com.tools.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.tools.beans.Tasks;

public class TaskDetailsRowMapper implements RowMapper<Tasks> {

	@Override
	public Tasks mapRow(ResultSet rs, int row) throws SQLException {

		Tasks task = new Tasks();
		task.setId(rs.getInt("ID"));
		task.setTaskName(rs.getString("TASKNAME"));
		task.setTaskType(rs.getString("TASKTYPE"));
		task.setTaskDescription(rs.getString("TASKDESC"));
		task.setTaskCreateDate(rs.getDate("TASK_CREATEDATE"));
		task.setTaskUpdateDate(rs.getDate("TASK_UPDATEDATE"));
		task.setTaskClosedDate(rs.getDate("TASK_CLOSEDDATE"));
		task.setTaskCommitDate(rs.getDate("TASK_COMMITDATE"));
		task.setTaskStartDate(rs.getDate("TASK_STARTDATE"));
		task.setTaskStatus(rs.getString("TASK_STATUS"));
		task.setCreaterId(rs.getString("CREATORID"));
		task.setOwnerUserId(rs.getString("OWNER_USERID"));
		task.setOwnerGroupId(rs.getString("OWNER_GROUPID"));
		task.setPoints(rs.getInt("POINTS"));
		task.setEnabled(rs.getString("ENABLED"));
		
		return task;
	}
}
