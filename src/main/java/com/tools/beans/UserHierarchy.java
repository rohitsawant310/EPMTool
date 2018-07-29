package com.tools.beans;

public class UserHierarchy {
	
	private Integer id;
	private String userId;
	private String parentUserId;
	private String parentUserRelation;
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
	public String getParentUserId() {
		return parentUserId;
	}
	public void setParentUserId(String parentUserId) {
		this.parentUserId = parentUserId;
	}
	public String getParentUserRelation() {
		return parentUserRelation;
	}
	public void setParentUserRelation(String parentUserRelation) {
		this.parentUserRelation = parentUserRelation;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "UserHierarchy [id=" + id + ", userId=" + userId + ", parentUserId=" + parentUserId
				+ ", parentUserRelation=" + parentUserRelation + ", enabled=" + enabled + ", getId()=" + getId()
				+ ", getUserId()=" + getUserId() + ", getParentUserId()=" + getParentUserId()
				+ ", getParentUserRelation()=" + getParentUserRelation() + ", getEnabled()=" + getEnabled()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
