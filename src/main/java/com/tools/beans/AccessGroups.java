package com.tools.beans;

public class AccessGroups {
	
	private Integer id;
	private String groupName;
	private String groupDescription;
	private String enabled;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupDescription() {
		return groupDescription;
	}
	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "AccessGroups [id=" + id + ", groupName=" + groupName + ", groupDescription=" + groupDescription
				+ ", enabled=" + enabled + "]";
	}
}
