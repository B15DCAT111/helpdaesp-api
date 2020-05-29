package com.java.gr6.rest;

import java.util.List;

import com.java.gr6.RelatedBO.ReponseMessage;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

public interface EmployeeResiAPI {
	public List<EmployeeDTO> findEmployees(EmployeeDTO obj);

	public List<EmployeeDTO> getAllEmp();

	public ReponseMessage createEmployee(EmployeeDTO obj);

	public ReponseMessage upDateEmployee(EmployeeDTO obj,String empCode);

	public ReponseMessage deleteEmployee(String empCode);
}
