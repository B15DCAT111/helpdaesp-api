package com.java.gr6.helpdeskDTO;

import java.util.Date;

public class EmployeeDTO {
	private Long empId;
	private String empFullName;
	private String empEmail;
	private int empGender; // 0 : nam || 1 : nữ
	private String empAddress;
	private String empAvatar;
	private Date empBirthDay;
	private String numberPhone;
	private String depCode;
	private String roleCode;
	private String empCode;
	private int haveAcc; // 0: chưa có tài khoản || 1: đã có tài khoản

	private String departmentName;
	private String roleName;

	private String messageFromServer;

	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDTO(Long empId, String empFullName, String empEmail, int empGender, String empAddress,
			String empAvatar, Date empBirthDay, String numberPhone, String depCode, String roleCode, String empCode,
			int haveAcc, String departmentName, String roleName) {
		super();
		this.empId = empId;
		this.empFullName = empFullName;
		this.empEmail = empEmail;
		this.empGender = empGender;
		this.empAddress = empAddress;
		this.empAvatar = empAvatar;
		this.empBirthDay = empBirthDay;
		this.numberPhone = numberPhone;
		this.depCode = depCode;
		this.roleCode = roleCode;
		this.empCode = empCode;
		this.haveAcc = haveAcc;
		this.departmentName = departmentName;
		this.roleName = roleName;

	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpFullName() {
		return empFullName;
	}

	public void setEmpFullName(String empFullName) {
		this.empFullName = empFullName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public int getEmpGender() {
		return empGender;
	}

	public void setEmpGender(int empGender) {
		this.empGender = empGender;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpAvatar() {
		return empAvatar;
	}

	public void setEmpAvatar(String empAvatar) {
		this.empAvatar = empAvatar;
	}

	public Date getEmpBirthDay() {
		return empBirthDay;
	}

	public void setEmpBirthDay(Date empBirthDay) {
		this.empBirthDay = empBirthDay;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public int getHaveAcc() {
		return haveAcc;
	}

	public void setHaveAcc(int haveAcc) {
		this.haveAcc = haveAcc;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getMessageFromServer() {
		return messageFromServer;
	}

	public void setMessageFromServer(String messageFromServer) {
		this.messageFromServer = messageFromServer;
	}

}
