package com.tools.beans;

import java.util.Date;

public class TaskActivity {

	private Integer id;
	private String taskId;
	private String notes;
	private String taskDescription;
	private Date taskCreateDate;
	private Date taskUpdateDate;
	private Date taskEndDate;
	private Date taskClosedDate;
	private String ownerUserId;
	private String ownerGroupId;
	private String enabled;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public Date getTaskCreateDate() {
		return taskCreateDate;
	}
	public void setTaskCreateDate(Date taskCreateDate) {
		this.taskCreateDate = taskCreateDate;
	}
	public Date getTaskUpdateDate() {
		return taskUpdateDate;
	}
	public void setTaskUpdateDate(Date taskUpdateDate) {
		this.taskUpdateDate = taskUpdateDate;
	}
	public Date getTaskEndDate() {
		return taskEndDate;
	}
	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}
	public Date getTaskClosedDate() {
		return taskClosedDate;
	}
	public void setTaskClosedDate(Date taskClosedDate) {
		this.taskClosedDate = taskClosedDate;
	}
	public String getOwnerUserId() {
		return ownerUserId;
	}
	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	public String getOwnerGroupId() {
		return ownerGroupId;
	}
	public void setOwnerGroupId(String ownerGroupId) {
		this.ownerGroupId = ownerGroupId;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "TaskActivity [id=" + id + ", taskId=" + taskId + ", notes=" + notes + ", taskDescription="
				+ taskDescription + ", taskCreateDate=" + taskCreateDate + ", taskUpdateDate=" + taskUpdateDate
				+ ", taskEndDate=" + taskEndDate + ", taskClosedDate=" + taskClosedDate + ", ownerUserId=" + ownerUserId
				+ ", ownerGroupId=" + ownerGroupId + ", enabled=" + enabled + "]";
	}
}
