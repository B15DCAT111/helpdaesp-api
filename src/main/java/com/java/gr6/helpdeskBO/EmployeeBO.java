package com.java.gr6.helpdeskBO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeBO {
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

	public EmployeeBO() {
		super();
	}

	public EmployeeBO(Long empId, String empFullName, String empEmail, int empGender, String empAddress,
			String empAvatar, Date empBirthDay, String numberPhone, String depCode, String roleCode, String empCode,
			int haveAcc) {
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
	}

	@Id
	@Column(name = "EMPLOYEE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	@Column(name = "FULL_NAME", columnDefinition = "nvarchar (100)")
	public String getEmpFullName() {
		return empFullName;
	}

	public void setEmpFullName(String empFullName) {
		this.empFullName = empFullName;
	}

	@Column(name = "EMAIL", columnDefinition = "nvarchar (70)")
	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	@Column(name = "GENDER")
	public int getEmpGender() {
		return empGender;
	}

	public void setEmpGender(int empGender) {
		this.empGender = empGender;
	}

	@Column(name = "ADDRESS", columnDefinition = "nvarchar (200)")
	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Column(name = "AVATAR", columnDefinition = "nvarchar (300)")
	public String getEmpAvatar() {
		return empAvatar;
	}

	public void setEmpAvatar(String empAvatar) {
		this.empAvatar = empAvatar;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTHDAY", length = 19)
	public Date getEmpBirthDay() {
		return empBirthDay;
	}

	public void setEmpBirthDay(Date empBirthDay) {
		this.empBirthDay = empBirthDay;
	}

	@Column(name = "NUMBER_PHONE", columnDefinition = "nvarchar (20)")
	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	@Column(name = "DEPARTMENT_CODE", columnDefinition = "nvarchar (100)")
	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	@Column(name = "ROLE_CODE", columnDefinition = "nvarchar (100)")
	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	@Column(name = "EMPLOYEE_CODE", columnDefinition = "nvarchar (100)")
	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	@Column(name = "HAVE_ACCOUNT")
	public int getHaveAcc() {
		return haveAcc;
	}

	public void setHaveAcc(int haveAcc) {
		this.haveAcc = haveAcc;
	}
}
