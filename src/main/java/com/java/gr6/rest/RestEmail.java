package com.java.gr6.rest;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.gr6.RelatedBO.GiaoViec;
import com.java.gr6.bussiness.EmailBussiness;
import com.java.gr6.common.MailCommon;
import com.java.gr6.common.MailTemplate;
import com.java.gr6.common.RandomString;
import com.java.gr6.helpdeskDTO.AccountDTO;

@Controller
public class RestEmail {

	@ResponseBody
	@RequestMapping("/sendSimpleEmail")
	public String sendDemo(@RequestBody GiaoViec obj) {
		try {
			MailCommon.sendMail(obj.getEmail(), "[BÀN GIAO CÔNG VIỆC]",
					MailTemplate.giaoViec(obj.getWorkName(), obj.getWorkOfEmp()));
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
