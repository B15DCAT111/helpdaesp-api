package com.java.gr6.bussiness;

import java.util.Date;
import java.util.List;

import javax.mail.MessagingException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.gr6.RelatedBO.ReponseMessage;
import com.java.gr6.common.MailCommon;
import com.java.gr6.common.MailTemplate;
import com.java.gr6.common.RandomString;
import com.java.gr6.common.ResponseCommon;
import com.java.gr6.constant.Contants;
import com.java.gr6.helpDeskDAO.AccountDAO;
import com.java.gr6.helpDeskDAO.EmployeeDAO;
import com.java.gr6.helpdeskBO.AccountBO;
import com.java.gr6.helpdeskBO.EmployeeBO;
import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;
import com.java.gr6.repo.AccountJPA;
import com.java.gr6.repo.EmployeeJPA;

@Service
public class AccountBussinessImp implements AccountBussiness {

	@SuppressWarnings("unused")
	@Autowired
	private AccountDAO accDao;

	@Autowired
	private AccountJPA jpaAcc;

	@Autowired
	private EmployeeJPA jpaEmp;

	@Autowired
	private EmployeeDAO empdao;

	private ModelMapper mapper = new ModelMapper();

	@Override
	public List<AccountDTO> getTotalAcc() {

		return accDao.getTotalAcc();
	}

	@Override
	public AccountDTO findAccountByUserPass(String userName, String pass) {

		return accDao.findAccountByUserPass(userName, pass);
	}

	@Override
	public ReponseMessage createAccount(EmployeeDTO obj) {
		if (obj.getEmpEmail() != null) {
			AccountBO accountBO = new AccountBO();
			String passWord = RandomString.randomPassword();
			accountBO.setPassword(passWord);
			accountBO.setEmpCode(obj.getEmpCode());
			accountBO.setCreateDate(new Date());
			accountBO.setIsActivated(2);
			accountBO.setStatus(1);
			accountBO.setRoleCode(obj.getRoleCode());
			accountBO.setUserName(obj.getEmpEmail());

			// update nhan vien
			if (null != obj.getEmpCode() && !obj.getEmpCode().isEmpty()) {
				EmployeeDTO dto = empdao.findEmployeeByCode(obj.getEmpCode());
				EmployeeBO bo = mapper.map(dto, EmployeeBO.class);
				bo.setHaveAcc(1);
				jpaEmp.save(bo);
			}

			jpaAcc.save(accountBO);

			try {
				MailCommon.sendMail(obj.getEmpEmail(), Contants.SUBJECTMAIL,
						MailTemplate.createAccount(obj.getEmpEmail(), passWord));
			} catch (MessagingException e) {
				System.out.println("----------- SEND MAIL FAIL -----------");
				e.printStackTrace();
			}
			return ResponseCommon.success();
		}
		return ResponseCommon.fail(Contants.ERROR_EMAIL_EXISTS);

	}

	@Override
	public ReponseMessage upDatePassWord(AccountDTO obj, String newPass) {
		if (obj != null && obj.getPassword() != null && !obj.getPassword().isEmpty()) {
			AccountBO bo = mapper.map(obj, AccountBO.class);
			bo.setPassword(newPass);
			jpaAcc.save(bo);
			return ResponseCommon.success();
		} else {
			return ResponseCommon.fail(Contants.ERROR_CHANGEPASS);
		}

	}

	@Override
	public ReponseMessage upDateAccount(EmployeeDTO obj) {
		if (obj != null && obj.getHaveAcc() == 1 && obj.getEmpCode() != null) {
			AccountDTO accountDTO = accDao.findAccountByEmpcode(obj);
			AccountBO bo = mapper.map(accountDTO, AccountBO.class);
			bo.setStatus(0);
			bo.setCreateDate(new Date());

			EmployeeBO boEmp = mapper.map(obj, EmployeeBO.class);
			boEmp.setHaveAcc(0);
			jpaEmp.save(boEmp);
			jpaAcc.save(bo);
			return ResponseCommon.success();
		}
		return ResponseCommon.fail(Contants.ERROR_CHANGEPASS);
	}

}
