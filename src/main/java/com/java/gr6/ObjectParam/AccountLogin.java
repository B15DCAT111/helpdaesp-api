package com.java.gr6.ObjectParam;

public class AccountLogin {
	private String userName;
	private String passWord;

	public AccountLogin() {
		// TODO Auto-generated constructor stub
	}

	public AccountLogin(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
