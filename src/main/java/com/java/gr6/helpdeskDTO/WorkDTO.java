package com.java.gr6.helpdeskDTO;

import java.util.Date;

public class WorkDTO {
	private Long workId;
	private String comCode;
	private String empCode;
	private Date workStartDate;
	private Date workStartDateEnd;
	private int WorkStatus; // 0: đang chờ sử lý || 1 : đã sử lý xong
	private String workNote; // đánh giá

	private String empFullName;
	private String comName;

	private String catComName;

	public WorkDTO() {
		// TODO Auto-generated constructor stub
	}

	public WorkDTO(Long workId, String comCode, String empCode, Date workStartDate, Date workStartDateEnd,
			int workStatus, String workNote) {
		super();
		this.workId = workId;
		this.comCode = comCode;
		this.empCode = empCode;
		this.workStartDate = workStartDate;
		this.workStartDateEnd = workStartDateEnd;
		WorkStatus = workStatus;
		this.workNote = workNote;
	}

	public WorkDTO(Long workId, String comCode, String empCode, Date workStartDate, Date workStartDateEnd,
			int workStatus, String workNote, String empFullName, String comName) {
		super();
		this.workId = workId;
		this.comCode = comCode;
		this.empCode = empCode;
		this.workStartDate = workStartDate;
		this.workStartDateEnd = workStartDateEnd;
		WorkStatus = workStatus;
		this.workNote = workNote;
		this.empFullName = empFullName;
		this.comName = comName;
	}

	public Long getWorkId() {
		return workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public Date getWorkStartDate() {
		return workStartDate;
	}

	public void setWorkStartDate(Date workStartDate) {
		this.workStartDate = workStartDate;
	}

	public Date getWorkStartDateEnd() {
		return workStartDateEnd;
	}

	public void setWorkStartDateEnd(Date workStartDateEnd) {
		this.workStartDateEnd = workStartDateEnd;
	}

	public int getWorkStatus() {
		return WorkStatus;
	}

	public void setWorkStatus(int workStatus) {
		WorkStatus = workStatus;
	}

	public String getWorkNote() {
		return workNote;
	}

	public void setWorkNote(String workNote) {
		this.workNote = workNote;
	}

	public String getEmpFullName() {
		return empFullName;
	}

	public void setEmpFullName(String empFullName) {
		this.empFullName = empFullName;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getCatComName() {
		return catComName;
	}

	public void setCatComName(String catComName) {
		this.catComName = catComName;
	}

}
