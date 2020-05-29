package com.java.gr6.bussiness;

import java.util.List;

import com.java.gr6.helpdeskDTO.EmployeeDTO;
import com.java.gr6.helpdeskDTO.WorkDTO;

public interface WorkBussiness {
	public List<WorkDTO> getListWork();
	public List<WorkDTO> getListWorkByUser(EmployeeDTO obj);
}
