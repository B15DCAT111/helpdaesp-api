package com.java.gr6.bussiness;

import java.util.List;

import com.java.gr6.RelatedBO.ReponseMessage;
import com.java.gr6.helpdeskDTO.AccountDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

public interface EmployeeBussiness {

	public List<EmployeeDTO> findEmployees(EmployeeDTO obj);

	public List<EmployeeDTO> getAllEmp();

	public ReponseMessage createEmployee(EmployeeDTO obj);

	public ReponseMessage upDateEmployee(EmployeeDTO obj,String empCode);

	public ReponseMessage deleteEmployee(String empCode);
}
