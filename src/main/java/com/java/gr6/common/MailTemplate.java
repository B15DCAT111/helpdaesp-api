package com.java.gr6.common;

public class MailTemplate {
	public static String createAccount(String userName, String password) {
		StringBuilder builder = new StringBuilder();
		builder.append(" <html> ");
		builder.append(" <body> ");
		builder.append(" <br> ");
		builder.append(" <table bgcolor=\"#d4d4d4\" width=\"100%\"> ");
		builder.append(" <tr> ");
		builder.append(" <td> ");
		builder.append(" <b>Bạn vừa mới tạo tài khoản trong hệ thống Help Desk với thông tin như sau: ");
		builder.append(" <br><br> ");
		builder.append(" <font color=\"#ff6600\">Tài khoản: </font> ");
		builder.append(userName + " <br> ");
		builder.append(" <font color=\"#ff6600\">Mật khẩu: </font>  ");
		builder.append(password + " </b> (Yêu cầu đổi mật khẩu trong lần đăng nhập đầu tiên!)   ");
		builder.append(" </td></tr><tr ><td><br><br><br><strong style=\"font-size:  20px;\">Help Desk</strong> ");
		builder.append(" <table><tr><td style=\"vertical-align:top\">Develop Team ");
		builder.append(" <ul><li>TIỂU BẠCH LONG</li><li>NGÔ NGỌC BÁCH</li><li>NGÔ THỊ HẢI YẾN</li><li>NGUYỄN NGỌC ANH</li></ul> ");
		builder.append(" </td><tr></table></td></tr></table></body></html> ");
		
		return builder.toString();
	}
	
	public static String resetPassword(String userName, String password) {
		StringBuilder builder = new StringBuilder();
		builder.append(" <html> ");
		builder.append(" <body> ");
		builder.append(" <br> ");
		builder.append(" <table bgcolor=\"#d4d4d4\" width=\"100%\"> ");
		builder.append(" <tr> ");
		builder.append(" <td> ");
		builder.append(" <b>Tài khoản của bạn đã reset mật khẩu thành công: ");
		builder.append(" <br><br> ");
		builder.append(" <font color=\"#ff6600\">Tài khoản: </font> ");
		builder.append(userName + " <br> ");
		builder.append(" <font color=\"#ff6600\">Mật khẩu: </font>  ");
		builder.append(password + " </b> (Yêu cầu đổi mật khẩu trong lần đăng nhập đầu tiên!)   ");
		builder.append(" </td></tr><tr ><td><br><br><br><strong style=\"font-size:  20px;\">Help Desk</strong> ");
		builder.append(" <table><tr><td style=\"vertical-align:top\">Develop Team ");
		builder.append(" <ul><li>TIỂU BẠCH LONG</li><li>NGÔ NGỌC BÁCH</li><li>NGÔ THỊ HẢI YẾN</li><li>NGUYỄN NGỌC ANH</li></ul> ");
		builder.append(" </td><tr></table></td></tr></table></body></html> ");
		
		return builder.toString();
	}
	public static String giaoViec(String workName, String workOfEmp) {
		StringBuilder builder = new StringBuilder();
		builder.append(" <html> ");
		builder.append(" <body> ");
		builder.append(" <br> ");
		builder.append(" <table bgcolor=\"#d4d4d4\" width=\"100%\"> ");
		builder.append(" <tr> ");
		builder.append(" <td> ");
		builder.append(" <b>Bạn vừa mới có một yêu cầu hệ thống Help Desk với thông tin như sau: ");
		builder.append(" <br><br> ");
		builder.append(" <font color=\"#ff6600\">Công việc: </font> ");
		builder.append(workName + " <br> ");
		builder.append(" <font color=\"#ff6600\">Đến từ: </font>  ");
		builder.append(workOfEmp + " </b>    ");
		builder.append(" </td></tr><tr ><td><br><br><br><strong style=\"font-size:  20px;\">Help Desk</strong> ");
		builder.append(" <table><tr><td style=\"vertical-align:top\">Develop Team ");
		builder.append(" <ul><li>TIỂU BẠCH LONG</li><li>NGÔ NGỌC BÁCH</li><li>NGÔ THỊ HẢI YẾN</li><li>NGUYỄN NGỌC ANH</li></ul> ");
		builder.append(" </td><tr></table></td></tr></table></body></html> ");
		
		return builder.toString();
	}
}
