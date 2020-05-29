package com.java.gr6.bussiness;

import java.util.List;

import com.java.gr6.helpdeskDTO.ComplaintDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

public interface ComplaintBussiness {
	public List<ComplaintDTO> getTotalComplaintDTO();
	public List<ComplaintDTO> getTotalComplaintDTOByUser(EmployeeDTO employeeDTO);

}
