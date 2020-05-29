package com.java.gr6.rest;

import java.util.List;

import com.java.gr6.RelatedBO.ReponseMessage;
import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

public interface AccountRestAPI {
	public List<AccountDTO> getTotalAcc();

	public AccountDTO findAccountByUserPass(AccountDTO obj);

	public ReponseMessage createAccount(EmployeeDTO obj);

	public ReponseMessage upDatePassWord(AccountDTO obj, String newPass);

	public ReponseMessage upDateAccount(EmployeeDTO obj);

}
