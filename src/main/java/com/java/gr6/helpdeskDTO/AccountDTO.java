package com.java.gr6.helpdeskDTO;

import java.util.Date;

public class AccountDTO {
	private Long accountId;
	private String userName;
	private String password;
	private String roleCode;
	private String empCode;
	private int isActivated; // 0 : chưa kích hoạt || 1 : đang chờ kích hoạt || 2 : đã kích hoạt
	private Date createDate;
	private int status; // 1 : đang hoạt độgn || 0 : ngừng hoạt động

	private String email;
	private String fullName;
	private int haveAcc;

	public AccountDTO() {
		super();
	}

	public AccountDTO(Long accountId, String userName, String password, String roleCode, String empCode,
			int isActivated, Date createDate, int status) {
		super();
		this.accountId = accountId;
		this.userName = userName;
		this.password = password;
		this.roleCode = roleCode;
		this.empCode = empCode;
		this.isActivated = isActivated;
		this.createDate = createDate;
		this.status = status;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getIsActivated() {
		return isActivated;
	}

	public void setIsActivated(int isActivated) {
		this.isActivated = isActivated;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getHaveAcc() {
		return haveAcc;
	}

	public void setHaveAcc(int haveAcc) {
		this.haveAcc = haveAcc;
	}

}
