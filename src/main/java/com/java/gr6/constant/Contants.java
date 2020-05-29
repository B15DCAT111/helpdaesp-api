package com.java.gr6.constant;

import com.java.gr6.RelatedBO.Email;

public class Contants {
	public static final String ERROR_OBJ = "OBJ khong duoc null";
	public static final String ERROR_CHANGEPASS = "Lỗi khi thay đổi pass";
	public static final String ERROR_EMAIL_EXISTS = "Mail Null";
	public static final String SUBJECTMAIL = "[ ĐĂNG KÝ TÀI KHOẢN HỆ THỐNG HELP DESK ]";
	// localhost
	public static final String LOCALHOST = "http://localhost:8080/";
	// mail
	public static final String EMAIL_SYSTEM = "longlkjr9777@gmail.com";
	public static final String PASSWORD = "daocanlong_97";
	public static final String HOST_MAIL = "smtp.gmail.com";

	// Account
	public static final int NOT_ACTIVATED_ACC = 0;
	public static final int WAITING_ACTIVATED_ACC = 1;
	public static final int ACTIVATED_ACC = 2;

	// Account
	public static final int ACTIONING_ACC = 1;
	public static final int STOP_ACC = 0;

	// COMPLAINT
	public static final int CANCEL_COMPLAINT = 0;

	// EMPLOYEE
	public static final int MALE = 0;
	public static final int FEMALE = 1;

	public static final int HAVE_ACC = 0;
	public static final int NOT_HAVE_ACC = 1;

	public static final String SUCCESS = "SUCCESS";

	// WORK
	// 0: đang chờ sử lý || 1 : đã sử lý xong
	public static final int WAITING_WORK = 0;
	public static final int WORKED = 1;

	public static Email getEmail() {
		Email email = new Email(EMAIL_SYSTEM, PASSWORD);
		return email;
	}

	// Respone From Server
	public static final String OK = "OK";
	public static final String NOT_OK = "NOT_OK";
}
