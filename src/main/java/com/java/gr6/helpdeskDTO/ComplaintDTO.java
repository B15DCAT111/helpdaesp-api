package com.java.gr6.helpdeskDTO;

import java.io.Serializable;
import java.util.Date;

public class ComplaintDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long comId;
	private String comName;
	private String comCode;
	private String comImg;
	private String comContent;
	private Date comCreateDate;
	private int comStatus; // 0 : đã hủy
	private String catComCode;
	private String empCode;

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
	private int haveAcc; // 0: chưa có tài khoản || 1: đã có tài khoản

	private String catComName;
	private String departmentName;
	private String roleName;

	public ComplaintDTO() {
		// TODO Auto-generated constructor stub
	}

	public ComplaintDTO(Long comId, String comName, String comCode, String comImg, String comContent,
			Date comCreateDate, int comStatus, String catComCode, String empCode, Long empId, String empFullName,
			String empEmail, int empGender, String empAddress, String empAvatar, Date empBirthDay, String numberPhone,
			String depCode, String roleCode, int haveAcc, String catComName) {
		super();
		this.comId = comId;
		this.comName = comName;
		this.comCode = comCode;
		this.comImg = comImg;
		this.comContent = comContent;
		this.comCreateDate = comCreateDate;
		this.comStatus = comStatus;
		this.catComCode = catComCode;
		this.empCode = empCode;
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
		this.haveAcc = haveAcc;
		this.catComName = catComName;
	}

	public Long getComId() {
		return comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getComImg() {
		return comImg;
	}

	public void setComImg(String comImg) {
		this.comImg = comImg;
	}

	public String getComContent() {
		return comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

	public Date getComCreateDate() {
		return comCreateDate;
	}

	public void setComCreateDate(Date comCreateDate) {
		this.comCreateDate = comCreateDate;
	}

	public int getComStatus() {
		return comStatus;
	}

	public void setComStatus(int comStatus) {
		this.comStatus = comStatus;
	}

	public String getCatComCode() {
		return catComCode;
	}

	public void setCatComCode(String catComCode) {
		this.catComCode = catComCode;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
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

	public int getHaveAcc() {
		return haveAcc;
	}

	public void setHaveAcc(int haveAcc) {
		this.haveAcc = haveAcc;
	}

	public String getCatComName() {
		return catComName;
	}

	public void setCatComName(String catComName) {
		this.catComName = catComName;
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

}
