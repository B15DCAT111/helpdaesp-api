package com.java.gr6.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.gr6.helpDeskDAO.ComplaintDAO;
import com.java.gr6.helpdeskDTO.ComplaintDTO;
import com.java.gr6.helpdeskDTO.EmployeeDTO;

@Service
public class ComplaintBussinessImp implements ComplaintBussiness {

	@SuppressWarnings("unused")
	@Autowired
	private ComplaintDAO comDao;

	@Override
	public List<ComplaintDTO> getTotalComplaintDTO() {
		
		return comDao.getTotalComplaintDTO();
	}

	@Override
	public List<ComplaintDTO> getTotalComplaintDTOByUser(EmployeeDTO employeeDTO) {
		
		return comDao.getTotalComplaintDTOByUser(employeeDTO);
	}

}
