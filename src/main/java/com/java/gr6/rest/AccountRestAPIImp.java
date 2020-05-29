package com.java.gr6.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.gr6.RelatedBO.ReponseMessage;
import com.java.gr6.bussiness.AccountBussiness;
import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@RestController
@RequestMapping("account")
public class AccountRestAPIImp implements AccountRestAPI {
	@Autowired
	private AccountBussiness accountBussiness;

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/getTotalAcc")
	public List<AccountDTO> getTotalAcc() {
		List<AccountDTO> list = accountBussiness.getTotalAcc();
		return list;
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/findAccountByUserPass")
	public AccountDTO findAccountByUserPass(@RequestBody AccountDTO obj) {
		AccountDTO accountDTO = accountBussiness.findAccountByUserPass(obj.getUserName(),obj.getPassword());
		return accountDTO;
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/creatAccount")
	public ReponseMessage createAccount(@RequestBody EmployeeDTO obj) {
		ReponseMessage mss = accountBussiness.createAccount(obj);
		return mss;
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/upDatePassWord")
	public ReponseMessage upDatePassWord(@RequestBody AccountDTO obj, @PathVariable("newPass") String newPass) {
		ReponseMessage mss = accountBussiness.upDatePassWord(obj, newPass);
		return mss;
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/deleteAccount")
	public ReponseMessage upDateAccount(@RequestBody EmployeeDTO obj) {
		ReponseMessage mss = accountBussiness.upDateAccount(obj);
		return mss;
	}

}
