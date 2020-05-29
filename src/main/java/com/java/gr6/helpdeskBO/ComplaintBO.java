package com.java.gr6.helpdeskBO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "COMPLAINT")
public class ComplaintBO {
	private Long comId;
	private String comName;
	private String comCode;
	private String comImg;
	private String comContent;
	private Date comCreateDate;
	private int comStatus; // 0 : đã hủy
	private String catComCode;
	private String empCode;

	public ComplaintBO() {
		super();
	}

	public ComplaintBO(Long comId, String comName, String comCode, String comImg, String comContent, Date comCreateDate,
			int comStatus, String catComCode, String empCode) {
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
	}

	@Id
	@Column(name = "COMPLAINT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getComId() {
		return comId;
	}

	public void setComId(Long comId) {
		this.comId = comId;
	}

	@Column(name = "COMPLAINT_NAME", columnDefinition = "nvarchar (100)")
	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	@Column(name = "COMPLAINT_CODE", columnDefinition = "nvarchar (100)")
	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	@Column(name = "COMPLAINT_IMG", columnDefinition = "nvarchar (300)")
	public String getComImg() {
		return comImg;
	}

	public void setComImg(String comImg) {
		this.comImg = comImg;
	}

	@Column(name = "COMPLAINT_CONTENT", columnDefinition = "nvarchar (200)")
	public String getComContent() {
		return comContent;
	}

	public void setComContent(String comContent) {
		this.comContent = comContent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "COMPLAINT_CREATE_DATE", length = 19)
	public Date getComCreateDate() {
		return comCreateDate;
	}

	public void setComCreateDate(Date comCreateDate) {
		this.comCreateDate = comCreateDate;
	}

	@Column(name = "COMPLAINT_STATUS")
	public int getComStatus() {
		return comStatus;
	}

	public void setComStatus(int comStatus) {
		this.comStatus = comStatus;
	}

	@Column(name = "CATEGORY_COMPLAINT_CODE", columnDefinition = "nvarchar (100)")
	public String getCatComCode() {
		return catComCode;
	}

	public void setCatComCode(String catComCode) {
		this.catComCode = catComCode;
	}

	@Column(name = "employee_code", columnDefinition = "nvarchar (100)")
	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	
	

}
