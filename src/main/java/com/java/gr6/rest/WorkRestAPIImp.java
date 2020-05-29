package com.java.gr6.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.gr6.bussiness.EmployeeBussiness;
import com.java.gr6.bussiness.WorkBussiness;
import com.java.gr6.helpdeskDTO.EmployeeDTO;
import com.java.gr6.helpdeskDTO.WorkDTO;

@RestController
@RequestMapping("work")
public class WorkRestAPIImp implements WorkRestAPI {

	@Autowired
	private WorkBussiness workBussiness;

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/getListWork")
	public List<WorkDTO> getListWork() {

		return workBussiness.getListWork();
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/getListWorkByUser")
	public List<WorkDTO> getListWorkByUser(@RequestBody EmployeeDTO obj) {

		return workBussiness.getListWorkByUser(obj);
	}

}
