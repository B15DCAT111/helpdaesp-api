package com.java.gr6.RelatedBO;

public class GiaoViec {
	private String email;
	private String workName;
	private String workOfEmp;
	
	public GiaoViec() {
		// TODO Auto-generated constructor stub
	}

	public GiaoViec(String email, String workName, String workOfEmp) {
		super();
		this.email = email;
		this.workName = workName;
		this.workOfEmp = workOfEmp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getWorkOfEmp() {
		return workOfEmp;
	}

	public void setWorkOfEmp(String workOfEmp) {
		this.workOfEmp = workOfEmp;
	}
	
}
