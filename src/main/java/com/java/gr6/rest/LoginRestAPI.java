package com.java.gr6.rest;

import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

public interface LoginRestAPI {
	public EmployeeDTO findEmployeebyAcc(AccountDTO obj);
}
