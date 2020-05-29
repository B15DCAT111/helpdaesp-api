package com.java.gr6.helpdeskDTO;

public class DepartermentDTO {
	private Long departmentId;
	private String departmentName;
	private String getDepartmentCode;

	public DepartermentDTO() {
		// TODO Auto-generated constructor stub
	}

	public DepartermentDTO(Long departmentId, String departmentName, String getDepartmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.getDepartmentCode = getDepartmentCode;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getGetDepartmentCode() {
		return getDepartmentCode;
	}

	public void setGetDepartmentCode(String getDepartmentCode) {
		this.getDepartmentCode = getDepartmentCode;
	}

}
