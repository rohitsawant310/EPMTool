package com.tools.beans;

public class AppDropdown{
	
	private Integer id;
	private String dropdownName;
	private String dropdownKey;
	private String dropdownValue;
	private String enabled;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDropdownName() {
		return dropdownName;
	}
	public void setDropdownName(String dropdownName) {
		this.dropdownName = dropdownName;
	}
	public String getDropdownKey() {
		return dropdownKey;
	}
	public void setDropdownKey(String dropdownKey) {
		this.dropdownKey = dropdownKey;
	}
	public String getDropdownValue() {
		return dropdownValue;
	}
	public void setDropdownValue(String dropdownValue) {
		this.dropdownValue = dropdownValue;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "AppDropdown [id=" + id + ", dropdownName=" + dropdownName + ", dropdownKey=" + dropdownKey
				+ ", dropdownValue=" + dropdownValue + ", enabled=" + enabled + "]";
	}
}
