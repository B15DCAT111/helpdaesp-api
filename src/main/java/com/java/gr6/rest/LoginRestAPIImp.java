package com.java.gr6.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.gr6.bussiness.LoginBussiness;
import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@RestController
public class LoginRestAPIImp implements LoginRestAPI {
	@Autowired
	private LoginBussiness loginBussiness;

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/login")
	public EmployeeDTO findEmployeebyAcc(@RequestBody AccountDTO obj) {
		EmployeeDTO dto = new EmployeeDTO();
		dto = loginBussiness.findEmployeebyAcc(obj.getUserName(),obj.getPassword());
		return dto;
	}

}
