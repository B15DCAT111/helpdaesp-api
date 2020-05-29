package com.java.gr6.bussiness;

import java.util.List;

import com.java.gr6.RelatedBO.ReponseMessage;
import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

public interface AccountBussiness {
	public List<AccountDTO> getTotalAcc();

	public AccountDTO findAccountByUserPass(String userName,String pass);

	public ReponseMessage createAccount(EmployeeDTO obj);

	public ReponseMessage upDatePassWord(AccountDTO obj, String newPass);

	public ReponseMessage upDateAccount(EmployeeDTO obj);
}
