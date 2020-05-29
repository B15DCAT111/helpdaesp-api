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
import com.java.gr6.bussiness.EmployeeBussiness;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@RestController
@RequestMapping("employee")
public class EmployeeRestAPIImp implements EmployeeResiAPI {
	@Autowired
	private EmployeeBussiness employeeBussiness;

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/findEmployee")
	public List<EmployeeDTO> findEmployees(@RequestBody EmployeeDTO obj) {
		List<EmployeeDTO> listObj = employeeBussiness.findEmployees(obj);
		return listObj;
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/getAllEmp")
	public List<EmployeeDTO> getAllEmp() {
		List<EmployeeDTO> listObj = employeeBussiness.getAllEmp();
		return listObj;
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/createEmployee")
	public ReponseMessage createEmployee(@RequestBody EmployeeDTO obj) {
		ReponseMessage mss = employeeBussiness.createEmployee(obj);
		return mss;
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/upDateEmployee/{empCode}")
	public ReponseMessage upDateEmployee(@RequestBody EmployeeDTO obj,@PathVariable("empCode") String empCode) {
		ReponseMessage mss = employeeBussiness.upDateEmployee(obj,empCode);
		return mss;
	}

	@Override
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/deleteEmployee/{empCode}")
	public ReponseMessage deleteEmployee(@PathVariable("empCode") String empCode) {
		ReponseMessage mss = employeeBussiness.deleteEmployee(empCode);
		return mss;
	}

}
