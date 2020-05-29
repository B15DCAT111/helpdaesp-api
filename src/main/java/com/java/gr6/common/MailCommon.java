package com.java.gr6.common;

import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.java.gr6.constant.Contants;

public class MailCommon {

	@SuppressWarnings("restriction")
	public static void sendMail(String emailAddress, String subject, String content)
			throws AddressException, MessagingException {
		Properties props = System.getProperties();

		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", Contants.HOST_MAIL);
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.required", "true");

		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		Session mailSession = Session.getDefaultInstance(props, null);
		mailSession.setDebug(false);
		Message msg = new MimeMessage(mailSession);
		msg.setFrom(new InternetAddress(Contants.EMAIL_SYSTEM));

		InternetAddress[] address = { new InternetAddress(emailAddress) };
		msg.setRecipients(Message.RecipientType.TO, address);
		msg.setSubject(subject);
		msg.setSentDate(new Date());
		msg.setContent(content, "text/html; charset=utf-8");

		Transport transport = mailSession.getTransport("smtp");
		transport.connect(Contants.HOST_MAIL, Contants.EMAIL_SYSTEM, Contants.PASSWORD);
		transport.sendMessage(msg, msg.getAllRecipients());
		transport.close();
		System.out.println("--------------- SEND MAIL SUCCESS ---------------");
	}

}
