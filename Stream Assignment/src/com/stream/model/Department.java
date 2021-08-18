package com.stream.model;

public class Department {

	private int departmentId;
	private String departmentName;
	private int manageId;
	
	public Department(int departmentId, String departmentName, int manageId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.manageId = manageId;
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
	public int getManageId() {
		return manageId;
	}
	public void setManageId(int manageId) {
		this.manageId = manageId;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", manageId="
				+ manageId + "]";
	}
	
	
	
}
