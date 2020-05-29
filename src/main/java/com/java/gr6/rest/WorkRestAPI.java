package com.java.gr6.rest;

import java.util.List;

import com.java.gr6.helpdeskDTO.EmployeeDTO;
import com.java.gr6.helpdeskDTO.WorkDTO;

public interface WorkRestAPI {
	public List<WorkDTO> getListWork();

	public List<WorkDTO> getListWorkByUser(EmployeeDTO obj);
}
