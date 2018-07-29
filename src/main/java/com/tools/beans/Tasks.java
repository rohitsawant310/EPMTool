package com.tools.beans;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Tasks implements Serializable{
    private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String taskName;
	private String taskType;
	private String taskDescription;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date taskCreateDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date taskStartDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date taskUpdateDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date taskCommitDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date taskClosedDate;
	private String taskStatus;
	private String createrId;
	private String ownerUserId;
	private String ownerGroupId;
	private Integer points;
	private String enabled;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
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
	public Date getTaskStartDate() {
		return taskStartDate;
	}
	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}
	public Date getTaskUpdateDate() {
		return taskUpdateDate;
	}
	public void setTaskUpdateDate(Date taskUpdateDate) {
		this.taskUpdateDate = taskUpdateDate;
	}
	public Date getTaskCommitDate() {
		return taskCommitDate;
	}
	public void setTaskCommitDate(Date taskCommitDate) {
		this.taskCommitDate = taskCommitDate;
	}
	public Date getTaskClosedDate() {
		return taskClosedDate;
	}
	public void setTaskClosedDate(Date taskClosedDate) {
		this.taskClosedDate = taskClosedDate;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	public String getCreaterId() {
		return createrId;
	}
	public void setCreaterId(String createrId) {
		this.createrId = createrId;
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
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer points) {
		this.points = points;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Tasks [id=" + id + ", taskName=" + taskName + ", taskType=" + taskType + ", taskDescription="
				+ taskDescription + ", taskCreateDate=" + taskCreateDate + ", taskStartDate=" + taskStartDate
				+ ", taskUpdateDate=" + taskUpdateDate + ", taskCommitDate=" + taskCommitDate + ", taskClosedDate="
				+ taskClosedDate + ", taskStatus=" + taskStatus + ", createrId=" + createrId + ", ownerUserId="
				+ ownerUserId + ", ownerGroupId=" + ownerGroupId + ", points=" + points + ", enabled=" + enabled + "]";
	}
}
