package com.java.gr6.helpdeskDTO;

public class CategoryComplaintDTO {
	private Long catComId;
	private String catComName;
	private String catComCode;

	public CategoryComplaintDTO() {
		// TODO Auto-generated constructor stub
	}

	public CategoryComplaintDTO(Long catComId, String catComName, String catComCode) {
		super();
		this.catComId = catComId;
		this.catComName = catComName;
		this.catComCode = catComCode;
	}

	public Long getCatComId() {
		return catComId;
	}

	public void setCatComId(Long catComId) {
		this.catComId = catComId;
	}

	public String getCatComName() {
		return catComName;
	}

	public void setCatComName(String catComName) {
		this.catComName = catComName;
	}

	public String getCatComCode() {
		return catComCode;
	}

	public void setCatComCode(String catComCode) {
		this.catComCode = catComCode;
	}

}
