package com.tools.beans;

public class UserAccessGroups {
	
	private Integer id;
	private String userId;
	private String groupId;
	private String enabled;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "UserAccessGroups [id=" + id + ", userId=" + userId + ", groupId=" + groupId + ", enabled=" + enabled
				+ "]";
	}
}
