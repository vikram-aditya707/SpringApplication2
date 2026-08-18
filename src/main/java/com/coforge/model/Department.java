package com.coforge.model;

import jakarta.annotation.PostConstruct;

public class Department {
	
	private int departmentId;
	private String departmentName;
	private String departmentLocation;
	
	@PostConstruct
	public void init() {
		this.departmentId =1;
		this.departmentLocation="gr noida";
		this.departmentName="Training";
		
		
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentLocation=" + departmentLocation + "]";
	}

	public int getDepartmentId() { 
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	

}