package com.java.gr6.bussiness;

import com.java.gr6.ObjectParam.AccountLogin;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

public interface LoginBussiness {
	public EmployeeDTO findEmployeebyAcc(String userName,String pass);
}
