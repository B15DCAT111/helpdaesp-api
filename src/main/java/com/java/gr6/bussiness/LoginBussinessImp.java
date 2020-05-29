package com.java.gr6.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.gr6.ObjectParam.AccountLogin;
import com.java.gr6.helpDeskDAO.EmployeeDAO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@Service
public class LoginBussinessImp implements LoginBussiness {

	@SuppressWarnings("unused")
	@Autowired
	private EmployeeDAO empDAO;
	
	@Override
	public EmployeeDTO findEmployeebyAcc(String userName,String pass) {
		
		return empDAO.findEmployeebyAcc(userName,pass);
	}

}
