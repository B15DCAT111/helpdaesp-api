package com.java.gr6.bussiness;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.stereotype.Service;

import com.java.gr6.common.MailCommon;

@Service
public class EmailBussiness {
	private MailCommon common;

	public void sendMail(String emailTo, String subject, String content) throws AddressException, MessagingException {
		common.sendMail(emailTo, subject, content);
	}
}
